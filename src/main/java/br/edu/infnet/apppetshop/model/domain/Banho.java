package br.edu.infnet.apppetshop.model.domain;


public class Banho extends Servico{

	private boolean completo;
	private String porte;
	private boolean alergia;
	
	@Override
	public String toString() {
		
		return completo + ";" + porte + ";" + alergia + ";" + super.toString();
	}

	public boolean isCompleto() {
		return completo;
	}

	public void setCompleto(boolean completo) {
		this.completo = completo;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public boolean isAlergia() {
		return alergia;
	}

	public void setAlergia(boolean alergia) {
		this.alergia = alergia;
	}
	
	
}
