package br.edu.infnet.model.domain;

public class Exame {

	public boolean filhote;
	public float peso;
	public String medicacao;
	
	@Override
	public String toString() {
		
		return filhote + ";" + peso + ";" + medicacao;
	}
}
