package br.com.wcj.stady.ejb32.fabioricardo.persistence;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="seguradora")
public class Seguradora implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8697190011181580719L;

	@Id
	private Long id;

	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
