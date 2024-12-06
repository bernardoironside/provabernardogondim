package com.senac.br.bernardoEmissorMicroservico.entites;

import java.io.Serializable;

public class Usuario implements Serializable{
	

	private int id;
	private String nomedousuario;
	private String statusdousuario;

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
