
public class Main {
	public static void main(String[] args) {
		ContaCorrente vini = new ContaCorrente();
		
		vini.agencia = 123;
		vini.conta = 1234;
		
		System.out.println("A agência é " + vini.agencia + " e a conta é " + vini.conta);
		System.out.println("Atualmente você possui R$" + vini.consultarSaldo());
		System.out.println("Fazendo depósito de R$50...");
		System.out.println("Agora você possui R$" + vini.deposito(50));
		System.out.println("Fazendo saque de R$10...");
		System.out.println("Agora você possui R$" + vini.sacar(10));
		System.out.println("Atualmente você possui R$" + vini.consultarSaldo());
	}
}
