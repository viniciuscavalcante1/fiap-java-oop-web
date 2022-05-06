
public class ContaCorrente {
	
	double saldo = 0;
	int conta;
	int agencia;
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public double deposito(double valor) {
		saldo += valor;
		return saldo;
	}

	public double sacar(double valor) {
		saldo -= valor;
		return saldo;
	}
}