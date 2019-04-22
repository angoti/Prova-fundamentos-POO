package questao02;

import java.util.List;

public class TodasDespesasDeUmIndiv�duo {
	List<DespesaMes> listaDeDespesas;
	String CPF;

	public TodasDespesasDeUmIndiv�duo(List<DespesaMes> listaDeDespesas, String cPF) {
		super();
		this.listaDeDespesas = listaDeDespesas;
		CPF = cPF;
	}

	public String getCPF() {
		return CPF;
	}

	DespesaMes totalizaMes(int mes) {
		float despesaEmUmMes = 0;
		for (DespesaMes despesaMes : listaDeDespesas) {
			if (despesaMes.getMes() == mes)
				despesaEmUmMes += despesaMes.getValor();
		}
		return new DespesaMes(mes, despesaEmUmMes);
	}
}
