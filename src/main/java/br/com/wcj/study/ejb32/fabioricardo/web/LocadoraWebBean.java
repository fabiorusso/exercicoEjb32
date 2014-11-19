package br.com.wcj.study.ejb32.fabioricardo.web;

import javax.ejb.Stateful;
import javax.inject.Inject;

import br.com.wcj.study.ejb32.fabioricardo.persistence.Aluguel;
import br.com.wcj.study.ejb32.fabioricardo.persistence.Carro;
import br.com.wcj.study.ejb32.fabioricardo.persistence.Cliente;
import br.com.wcj.study.ejb32.fabioricardo.persistence.Seguradora;
import br.com.wcj.study.ejb32.fabioricardo.persistence.Usuario;
import br.com.wcj.study.ejb32.fabioricardo.service.AluguelService;
import br.com.wcj.study.ejb32.fabioricardo.service.ClienteService;
import br.com.wcj.study.ejb32.fabioricardo.service.SeguradoraService;

@Stateful
public class LocadoraWebBean {

	@Inject
	private SeguradoraService seguradoraService;

	@Inject
	private ClienteService clienteService;

	@Inject
	private AluguelService aluguelService;

	private Usuario usuarioLogado;
	private Cliente clienteSelecionado;
	private Long idCliente;
	private Seguradora seguradoraSelecionada;
	private Long idSeguradora;

	private Carro carroSelecionado;
	private Integer dias;

	private Aluguel aluguelSelecionado;

	public void cadastrarCliente() {
		clienteService.salvarCliente(clienteSelecionado);
	}

	public void buscarCliente() {
		clienteSelecionado = clienteService.buscarCliente(idCliente);
	}

	public void cadastrarSeguradora() {
		seguradoraService.cadastrarSeguradora(seguradoraSelecionada);
	}

	public void buscarSeguradora() {
		seguradoraSelecionada = seguradoraService.buscarSeguradora(idCliente);
	}

	public void alugar() {
		aluguelService.alugarCarro(clienteSelecionado, carroSelecionado, dias);
	}

	public void devolver() {
		aluguelService.realizarDevolucao(aluguelSelecionado);
	}

	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	public Cliente getClienteSelecionado() {
		return clienteSelecionado;
	}

	public void setClienteSelecionado(Cliente clienteSelecionado) {
		this.clienteSelecionado = clienteSelecionado;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Seguradora getSeguradoraSelecionada() {
		return seguradoraSelecionada;
	}

	public void setSeguradoraSelecionada(Seguradora seguradoraSelecionada) {
		this.seguradoraSelecionada = seguradoraSelecionada;
	}

	public Long getIdSeguradora() {
		return idSeguradora;
	}

	public void setIdSeguradora(Long idSeguradora) {
		this.idSeguradora = idSeguradora;
	}

	public Carro getCarroSelecionado() {
		return carroSelecionado;
	}

	public void setCarroSelecionado(Carro carroSelecionado) {
		this.carroSelecionado = carroSelecionado;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public Aluguel getAluguelSelecionado() {
		return aluguelSelecionado;
	}

	public void setAluguelSelecionado(Aluguel aluguelSelecionado) {
		this.aluguelSelecionado = aluguelSelecionado;
	}

}
