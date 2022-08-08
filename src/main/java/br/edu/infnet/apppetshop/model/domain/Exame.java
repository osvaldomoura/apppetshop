package br.edu.infnet.apppetshop.model.domain;

public class Exame extends Servico{

	private boolean filhote;
	private float peso;
	private String medicacao;
	
	@Override
	public String toString() {
		
		return filhote + ";" + peso + ";" + medicacao + ";" + super.toString();
	}

	public boolean isFilhote() {
		return filhote;
	}

	public void setFilhote(boolean filhote) {
		this.filhote = filhote;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}
	
}
