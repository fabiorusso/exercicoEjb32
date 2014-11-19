package br.com.wcj.study.ejb32.fabioricardo.service;

import java.io.Serializable;

import br.com.wcj.study.ejb32.fabioricardo.persistence.Cliente;

public interface ClienteService extends Serializable {
	
	void salvarCliente(Cliente cliente);
	
	Cliente buscarCliente(Long id);

}
