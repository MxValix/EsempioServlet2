package com.azienda.progetto.model;

public class TestBean {
	
	private String nome = null;

	public TestBean() {
		this(null);
	}

	public TestBean(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
