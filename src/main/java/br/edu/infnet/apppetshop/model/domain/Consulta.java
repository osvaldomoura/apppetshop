package br.edu.infnet.apppetshop.model.domain;

import java.time.LocalDateTime;

public class Consulta {
	private String descricao;
	private LocalDateTime data;
	private boolean enfermidade;
	
	@Override
	public String toString() {
		
		return descricao + ";" + data + ";" + enfermidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public boolean isEnfermidade() {
		return enfermidade;
	}

	public void setEnfermidade(boolean enfermidade) {
		this.enfermidade = enfermidade;
	}
	
	
}
