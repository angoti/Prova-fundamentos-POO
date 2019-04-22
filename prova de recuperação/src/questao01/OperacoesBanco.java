package questao01;

import java.util.List;

public interface OperacoesBanco {
	public Correntista encontraCorrentista(List<Correntista> todosCorrentistas, String cpfProcurado);
}
