package com.senac.br.bernardoEmissorMicroservico.configuration;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;


public class MQConfig {

	@Autowired
	private AmqpAdmin amqpAdmin;
	private Queue queue;
	private Queue queue (String queueName){
		return new Queue(queueName, true, false, false);
	}
	private DirectExchange createDirectExchange(){
		return new DirectExchange("usuariormq");
	}

	@PostConstruct
	private void Create (){
	this.queue = new Queue("usuario");
	// Create the direct exchange
	DirectExchange directExchange = createDirectExchange();
	// Create the binding
	Binding binding = new Binding(queue.getName(), Binding.DestinationType.QUEUE,
	directExchange.getName(), queue.getName(), null);
	amqpAdmin.declareQueue(queue);
	amqpAdmin.declareExchange(directExchange);
	amqpAdmin.declareBinding(binding);
	}

}