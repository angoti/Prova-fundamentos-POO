package questao01;

public class Correntista {
	private String cpfCliente; // cpf do correntista
	private float saldo; // saldo da conta

	public Correntista(String cpfCliente, float saldo) {
		this.cpfCliente = cpfCliente;
		this.saldo = saldo;
	}

	public String getCPFCliente() {
		return cpfCliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}
