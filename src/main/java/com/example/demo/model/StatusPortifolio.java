package com.example.demo.model;

public enum StatusPortifolio {

	PENDENTE("Pendente"), RECEBIDO("Recebido");

	private String descricao;

	StatusPortifolio(String descricao) {

		this.descricao = descricao;

	}

	public String getDescricao() {
		return descricao;
	}
}
