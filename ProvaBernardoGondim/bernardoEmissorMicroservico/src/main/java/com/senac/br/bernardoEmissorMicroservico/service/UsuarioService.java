package com.senac.br.bernardoEmissorMicroservico.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senac.br.bernardoEmissorMicroservico.entites.Usuario;



@Service
public class UsuarioService {

	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void atualizarStatus(Usuario usuario) {
		rabbitTemplate.convertAndSend("usuario", usuario);
	}
	
}