package br.edu.infnet.model.domain;

public class Servico {

	public String nome;
	public int valor;
	public boolean urgencia;
	
	@Override
	public String toString() {
		
		return nome + ";" + valor + ";" + urgencia;
	}
}
