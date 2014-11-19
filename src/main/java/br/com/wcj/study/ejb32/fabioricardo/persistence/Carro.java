package br.com.wcj.study.ejb32.fabioricardo.persistence;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class Carro {

	private String marca;
	
	private String modelo;
	
	@Enumerated(EnumType.STRING)
	private StatusCarro status;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
