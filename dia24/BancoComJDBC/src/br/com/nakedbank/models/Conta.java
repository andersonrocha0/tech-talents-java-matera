package br.com.nakedbank.models;

import java.time.LocalDate;

public class Conta {

	private String numero;

	private Float saldo = 0f;

	private Float chequeEspecial = 0f;

	private Boolean status = true;

	private java.sql.Date dataAbertura = java.sql.Date.valueOf(LocalDate.now());

	private java.sql.Date dataEncerramento;

	private Cliente cliente;

	public Conta(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public Float getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(Float chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public java.sql.Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(java.sql.Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public java.sql.Date getDataEncerramento() {
		return dataEncerramento;
	}

	public void setDataEncerramento(java.sql.Date dataEncerramento) {
		this.dataEncerramento = dataEncerramento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
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
		Conta other = (Conta) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", chequeEspecial=" + chequeEspecial + ", status="
				+ status + ", dataAbertura=" + dataAbertura + ", dataEncerramento=" + dataEncerramento + ", cliente="
				+ cliente + "]";
	}

}
