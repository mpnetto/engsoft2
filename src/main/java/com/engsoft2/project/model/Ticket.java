package com.engsoft2.project.model;

public class Ticket {
	
	private int numeroTicket;
	private Sala sala;
	private String tipo;
	private Escola escola;
	private String prazo;
	private boolean status;
	private String resumo;
	
	public Ticket()
	{
		
	}
	
	public Ticket(int numeroTicket, Sala sala, String tipo, Escola escola, String prazo, boolean status, String resumo)
	{
		this.numeroTicket = numeroTicket;
		this.sala = sala;
		this.tipo = tipo;
		this.escola = escola;
		this.prazo = prazo;
		this.status = status;
		this.resumo = resumo;
		
	}
	
	public int getNumeroTicket() {
		return numeroTicket;
	}

	public void setNumeroTicket(int numeroTicket) {
		this.numeroTicket = numeroTicket;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Escola getEscola() {
		return escola;
	}

	public void setEscola(Escola escola) {
		this.escola = escola;
	}

	public String getPrazo() {
		return prazo;
	}

	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
}
