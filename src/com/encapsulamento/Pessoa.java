package com.encapsulamento;

abstract public class Pessoa {
	private int idUsuario;
	private String email;
	private String cidade;
	
	
	// Métodos de acesso
	public int getIdUsuario() {
		return idUsuario;
		
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
		
	}
	public String getEmail() {
		return email;
		
	}
	public void setEmail(String email) {
		this.email = email;
		
	}
	public String getCidade() {
		return cidade;
		
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}
