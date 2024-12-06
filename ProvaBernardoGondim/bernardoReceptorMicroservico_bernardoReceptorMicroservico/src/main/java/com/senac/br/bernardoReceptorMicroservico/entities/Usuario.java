package com.senac.br.bernardoReceptorMicroservico.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Usuario implements Serializable{
	private static final String strategy = null;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usuario_id", nullable = false)
	private int id;
	
	@Column(name ="usuario_nome")
	private String nomedousuario;
	
	@Column(name ="usuario_status")
	private String statusdousuario ;
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomedousuario() {
		return nomedousuario;
	}

	public void setNomedousuario(String nomedousuario) {
		this.nomedousuario = nomedousuario;
	}

	public String getStatusdousuario() {
		return statusdousuario;
	}

	public void setStatusdousuario(String statusdousuario) {
		this.statusdousuario = statusdousuario;
	}
	
}