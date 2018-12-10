package com.engsoft2.project.model;

import java.util.ArrayList;

public class Escola {
	
	private String nome;
	private String bairro;
	private ArrayList<Aluno> alunos;
	private ArrayList<Ticket> tickets;
	private int capacidade;
	private ArrayList<Vaga> vagas;
	private ArrayList<Zona> zonas;
	private Infraestrutura infra;
	
	public Escola(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
