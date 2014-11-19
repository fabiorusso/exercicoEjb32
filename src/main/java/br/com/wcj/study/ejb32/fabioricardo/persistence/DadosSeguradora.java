package br.com.wcj.study.ejb32.fabioricardo.persistence;

import java.util.Set;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class DadosSeguradora {

	private Integer numeroDiasCarroReserva;

	@OneToMany
	private Set<Carro> carrosDisponiveis;

	private Double valorDiaria;

	@OneToOne
	private Cliente cliente;

	@ManyToOne
	private Seguradora seguradora;

	public Integer getNumeroDiasCarroReserva() {
		return numeroDiasCarroReserva;
	}

	public void setNumeroDiasCarroReserva(Integer numeroDiasCarroReserva) {
		this.numeroDiasCarroReserva = numeroDiasCarroReserva;
	}

	public Set<Carro> getCarrosDisponiveis() {
		return carrosDisponiveis;
	}

	public void setCarrosDisponiveis(Set<Carro> carrosDisponiveis) {
		this.carrosDisponiveis = carrosDisponiveis;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(Double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Seguradora getSeguradora() {
		return seguradora;
	}

	public void setSeguradora(Seguradora seguradora) {
		this.seguradora = seguradora;
	}

}
