package com.encapsulamento;

public final class PessoaJuridica extends Pessoa {
	// Atributos
	private String razaoSocial;
	private String nomeFantasia;
	
	//  Metodos de acesso
	public String getRazaoSocial() {
		return razaoSocial;
		
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		
	}
	public String getNomeFantasia() {
		return nomeFantasia;
		
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
		
	}

}
