package br.com.wcj.study.ejb32.fabioricardo.service;

import java.util.logging.Logger;

import javax.ejb.Stateless;

import br.com.wcj.study.ejb32.fabioricardo.persistence.Cliente;
import br.com.wcj.study.ejb32.fabioricardo.persistence.DadosSeguradora;
import br.com.wcj.study.ejb32.fabioricardo.persistence.Seguradora;

@Stateless
public class SeguradoraServiceImpl implements SeguradoraService {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2741217043505547930L;
	private static final Logger logger = Logger.getLogger("SeguradoraService");
	
	public void cadastrarSeguradora(Seguradora seguradora) {
		logger.info("Cadastrando seguradora ["+seguradora+"] na base de dados...");
	}

	public Seguradora buscarSeguradora(Long id) {
		logger.info("Buscando seguradora com id ["+id+"]...");
		return new Seguradora();
	}

	public DadosSeguradora obterDadosSeguradoraDoCliente(Cliente cliente) {
		logger.info("Fazendo uma requisição super segura para buscar os dados da seguradora do cliente ["+cliente+"]");
		logger.info("http://seguradora.com.br/dadosCliente/"+cliente.getId());
		return new DadosSeguradora();
	}

}
