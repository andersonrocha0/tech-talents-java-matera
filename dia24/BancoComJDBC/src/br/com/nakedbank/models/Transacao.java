package br.com.nakedbank.models;

import java.time.LocalDate;

public class Transacao {

	public Transacao(Conta conta) {
		super();
		this.conta = conta;
	}

	private Integer numeroIdentificacao;

	private java.sql.Date dataTransacao = java.sql.Date.valueOf(LocalDate.now());

	private Float valor;

	private String tipo;

	private Conta conta;

	public Integer getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(Integer numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public java.sql.Date getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(java.sql.Date dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroIdentificacao == null) ? 0 : numeroIdentificacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transacao other = (Transacao) obj;
		if (numeroIdentificacao == null) {
			if (other.numeroIdentificacao != null)
				return false;
		} else if (!numeroIdentificacao.equals(other.numeroIdentificacao))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Transacao [numeroIdentificacao=" + numeroIdentificacao + ", dataTransacao=" + dataTransacao + ", valor="
				+ valor + ", tipo=" + tipo + ", conta=" + conta + "]";
	}

}
