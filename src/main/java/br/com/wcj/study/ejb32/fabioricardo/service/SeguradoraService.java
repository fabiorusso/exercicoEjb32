package br.com.wcj.study.ejb32.fabioricardo.service;

import java.io.Serializable;

import br.com.wcj.study.ejb32.fabioricardo.persistence.Cliente;
import br.com.wcj.study.ejb32.fabioricardo.persistence.DadosSeguradora;
import br.com.wcj.study.ejb32.fabioricardo.persistence.Seguradora;

public interface SeguradoraService extends Serializable {

	void cadastrarSeguradora(Seguradora seguradora);
	Seguradora buscarSeguradora(Long id);
	DadosSeguradora obterDadosSeguradoraDoCliente(Cliente cliente);
	
}
