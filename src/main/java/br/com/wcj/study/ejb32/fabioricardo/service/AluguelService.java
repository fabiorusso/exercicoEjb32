package br.com.wcj.study.ejb32.fabioricardo.service;

import java.io.Serializable;

import br.com.wcj.study.ejb32.fabioricardo.persistence.Aluguel;
import br.com.wcj.study.ejb32.fabioricardo.persistence.Carro;
import br.com.wcj.study.ejb32.fabioricardo.persistence.Cliente;

public interface AluguelService extends Serializable {

	void realizarDevolucao(Aluguel aluguel);

	void alugarCarro(Cliente cliente, Carro carro, int dias);

}
