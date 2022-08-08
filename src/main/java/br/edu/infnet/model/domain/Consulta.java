package br.edu.infnet.model.domain;

import java.time.LocalDateTime;

public class Consulta {
	public String descricao;
	public LocalDateTime data;
	public boolean enfermidade;
	
	@Override
	public String toString() {
		
		return descricao + ";" + data + ";" + enfermidade;
	}
}
