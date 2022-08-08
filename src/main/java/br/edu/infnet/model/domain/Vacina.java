package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

public class Vacina {

	public boolean importada;
	public LocalDateTime data;
	public String descricao;
	
	@Override
	public String toString() {
		
		return importada + ";" + data + ";" + descricao;
	}
}
