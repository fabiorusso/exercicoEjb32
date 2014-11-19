package br.com.wcj.study.ejb32.fabioricardo.service;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.wcj.study.ejb32.fabioricardo.persistence.Aluguel;
import br.com.wcj.study.ejb32.fabioricardo.persistence.Carro;
import br.com.wcj.study.ejb32.fabioricardo.persistence.Cliente;
import br.com.wcj.study.ejb32.fabioricardo.persistence.DadosSeguradora;
import br.com.wcj.study.ejb32.fabioricardo.persistence.StatusAluguel;

@Stateless
public class AluguelServiceImpl implements AluguelService {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2045388769455216487L;
	
	private static final Logger logger = Logger.getLogger("AluguelService");
	
	@Inject 
	private SeguradoraService seguradoraService;
	
	@Override
	public void alugarCarro(Cliente cliente, Carro carro, int dias) {
		DadosSeguradora dados = seguradoraService.obterDadosSeguradoraDoCliente(cliente);
		
		Double valorDiaria = obterValorDiariaTabela();
		int diasAluguel = dias;
		
		if (dados != null) {
			logger.info("Buscando dados a partir dos dados fornecidos seguramente pela seguradora...");
			List<Carro> carros = dados.getCarrosDisponiveis().stream().filter((item) -> item.equals(carro)).collect(Collectors.toList());
			if (carros.isEmpty()) {
				logger.severe("Cliente não pode pegar este carro");
				return;
			}
			valorDiaria = dados.getValorDiaria();

			logger.info("Cliente segurado poderá ficar com o carro reserva em até "+diasAluguel+".");
			
			if (dados.getNumeroDiasCarroReserva() > diasAluguel) {
				logger.info("Dias solicitados é maior que o permitido pela seguradora. Os dias remanescentes serão cobrados");
				diasAluguel = dados.getNumeroDiasCarroReserva() - diasAluguel;
			} else {
				logger.info("Dias estão dentro do prazo da seguradora. Cliente não será cobrado");
				valorDiaria = 0.0D;
			}
		}
		logger.info("Valor do aluguel: "+(valorDiaria * diasAluguel));
		Aluguel al = new Aluguel();
		al.setCliente(cliente);
		al.setDias(diasAluguel);
		al.setCarro(carro);
		al.setTotalPagar(diasAluguel * valorDiaria);
		
		logger.info("Salvando diaria...");
	}
	
	@Override
	public void realizarDevolucao(Aluguel aluguel) {
		if (StatusAluguel.ALUGADO.equals(aluguel)) {
			logger.info("Finalizando aluguel...");
			int dias = calcularDiasAluguel(aluguel);
			
			if (dias > 0) {
				logger.info("Aluguel está atrasado. Realizando cobrança extra...");
				aluguel.setStatus(StatusAluguel.ATRASADO);
			} else {
				logger.info("Aluguel está ok");
				aluguel.setStatus(StatusAluguel.FINALIZADO);
			}
			
			logger.info("Salvando aluguel...");
		}
	}
	
	private int calcularDiasAluguel(Aluguel aluguel) {
		logger.info("calculando dias passados...");
		return 0;
	}
	
	private Double obterValorDiariaTabela() {
		logger.info("Obtendo o valor de tabela da diária...");
		return 0.0D;
	}
	
}
