package br.com.wcj.study.ejb32.fabioricardo.persistence;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "seguradora")
public class Seguradora implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8697190011181580719L;

	@Id
	private Long id;

	private String nome;

	@OneToMany
	private Set<Cliente> cliente;

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

	public Set<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(Set<Cliente> cliente) {
		this.cliente = cliente;
	}

}
