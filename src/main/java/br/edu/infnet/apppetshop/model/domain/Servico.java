package br.edu.infnet.apppetshop.model.domain;

public class Servico {

	private String nome;
	private int valor;
	private boolean urgencia;
	
	@Override
	public String toString() {
		
		return nome + ";" + valor + ";" + urgencia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public boolean isUrgencia() {
		return urgencia;
	}

	public void setUrgencia(boolean urgencia) {
		this.urgencia = urgencia;
	}
	
	
}
