package br.edu.infnet.model.domain;


public class Banho {

	public boolean completo;
	public String porte;
	public boolean alergia;
	
	@Override
	public String toString() {
		
		return completo + ";" + porte + ";" + alergia;
	}
}
