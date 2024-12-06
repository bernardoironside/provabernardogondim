package com.senac.br.bernardoEmissorMicroservico.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.senac.br.bernardoEmissorMicroservico.entites.Usuario;
import com.senac.br.bernardoEmissorMicroservico.service.UsuarioService;



@RestController
public class UsuarioController {
	private UsuarioService usuarioservice;
	@PostMapping("/atualizar")
	public ResponseEntity<Usuario> atualizarStatus(@RequestBody Usuario usuario){
		usuarioservice.atualizarStatus(usuario);
		return new ResponseEntity<>(usuario ,HttpStatus.CREATED);
	}
	public UsuarioController(UsuarioService usuarioservice) {
		super();
		this.usuarioservice = usuarioservice;
	}
}