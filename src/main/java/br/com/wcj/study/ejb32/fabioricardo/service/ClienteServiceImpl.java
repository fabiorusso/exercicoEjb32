package br.com.wcj.study.ejb32.fabioricardo.service;

import java.util.logging.Logger;

import javax.ejb.Stateless;

import br.com.wcj.study.ejb32.fabioricardo.persistence.Cliente;

@Stateless
public class ClienteServiceImpl implements ClienteService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2833813972096942089L;
	private static final Logger logger = Logger.getLogger("ClienteService");

	public void salvarCliente(Cliente cliente) {
		logger.info("Salvando cliente ["+cliente+"] na base de dados...");
	}

	public Cliente buscarCliente(Long id) {
		logger.info("Buscando cliente com id ["+id+"]");
		return new Cliente();
	}

}
