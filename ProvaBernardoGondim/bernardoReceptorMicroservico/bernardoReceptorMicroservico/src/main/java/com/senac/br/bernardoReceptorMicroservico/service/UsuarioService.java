package com.senac.br.bernardoReceptorMicroservico.service;

import com.senac.br.bernardoReceptorMicroservico.entities.Usuario;

public class UsuarioService {

	public void atualizarStatus(Usuario usuario) {
		RabbitTemplateConfigurer("usuario", usuario);
	}

	private void RabbitTemplateConfigurer(String string, Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	
}