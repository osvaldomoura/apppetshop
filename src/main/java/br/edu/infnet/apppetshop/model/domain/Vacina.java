package br.edu.infnet.apppetshop.model.domain;

import java.time.LocalDateTime;

public class Vacina extends Servico{

	private boolean importada;
	private LocalDateTime data;
	private String descricao;
	
	@Override
	public String toString() {
		
		return importada + ";" + data + ";" + descricao + ";" + super.toString();
	}

	public boolean isImportada() {
		return importada;
	}

	public void setImportada(boolean importada) {
		this.importada = importada;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
