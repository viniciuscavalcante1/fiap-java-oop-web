
public class BilheteUnico {
	int numero = (int)(Math.random() * 1000);
	double saldo = 0.0;
	double valorPassagem;
	Usuario usuario;
	
	public BilheteUnico(
			double valorPassagem,
			Usuario usuario) {
		this.valorPassagem = valorPassagem;
		this.usuario = usuario;
	}
	
	public double verificarSaldo() {
		return this.saldo;
	}
	
	public void passarNaCatraca() {
		if(this.usuario.tipo == "Estudante" || this.usuario.tipo == "Professor") {
			this.saldo = this.saldo - (this.valorPassagem/2);
		}
		else {
			this.saldo = this.saldo - this.valorPassagem;
		}
	}
	
	public void carregar(double valor) {
		this.saldo = this.saldo + valor;
	}
}
