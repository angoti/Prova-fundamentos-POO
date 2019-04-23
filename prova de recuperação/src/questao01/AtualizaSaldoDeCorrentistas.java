package questao01;

import java.util.List;

public class AtualizaSaldoDeCorrentistas {
	void atualizar(
			List<Correntista> listaDeCorrentistas, 
			List<MovimentoConta> listaDeMovimentos, 
			OperacoesBanco operacoes) {
		
		for (MovimentoConta movimentoConta : listaDeMovimentos) {
			Correntista c = operacoes.encontraCorrentista(listaDeCorrentistas, movimentoConta.getCPFCorrentista());
			c.setSaldo(c.getSaldo() + movimentoConta.getValorMovimento());
		
		}
	}
}
