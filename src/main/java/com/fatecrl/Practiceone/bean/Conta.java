package com.fatecrl.Practiceone.bean;

import java.io.Serializable;
import java.util.Objects;

public class Conta implements Serializable {
	private static final long serialVersionUID = -4205156507257923921L;
    private Long nextId = 1L;
	private Long id;
	private Integer agencia;
	private String numero;
	private String titular;
	private Double saldo;
	
	//implicito
	public Conta() {
		
	}
	public Conta(Long id) {
		this.id = id;
	}
	public Long generateId() {
		return nextId++;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getAgencia() {
		return agencia;
	}
	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	//sobreposicao do metodo de criacao de hash
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	//sobreposicao, passa a fazer as buscas baseando-se nao nos valores mas sim em suas posicoes na memoria
	@Override
	public boolean equals(Object obj) {
	//this sem nenhum complemento referencia a classe, ou seja, todo os seus elementos serao referenciados
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(id, other.id);
	}
}
