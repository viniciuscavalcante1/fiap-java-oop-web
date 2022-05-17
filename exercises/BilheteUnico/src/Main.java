import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Usuario user = new Usuario("João", "3123", "Estudante");
		System.out.println(user.cpf);
		System.out.println(user.nome);
		System.out.println(user.tipo);
		
		BilheteUnico bilhete = new BilheteUnico(4.20, user);
		System.out.println(bilhete.numero);
		System.out.println(bilhete.valorPassagem);
		System.out.println(bilhete.usuario);
		System.out.println(bilhete.saldo);
		bilhete.carregar(50);
		System.out.println(bilhete.saldo);
		bilhete.passarNaCatraca();
		System.out.println(bilhete.saldo);
	}

}
