package br.com.sen.senbe.domain;

import java.io.Serializable;

public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String solicitante;
	private String descricao;
	
	public Pedido() {
		
	}
	
	public Pedido(int id, String solicitante, String descricao) {
		super();
		this.id = id;
		this.solicitante = solicitante;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Pedido other = (Pedido) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}