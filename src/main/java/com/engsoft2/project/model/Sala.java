package com.engsoft2.project.model;

public class Sala {
	
	private String numero;
	private float metragem;
	private int capacidade;
	
	public Sala(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}
