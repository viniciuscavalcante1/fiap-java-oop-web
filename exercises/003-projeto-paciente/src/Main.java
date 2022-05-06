import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Paciente paciente = new Paciente();
		
		System.out.println("Nome: ");
		paciente.nome = ler.next();
		
		System.out.println("Idade: ");
		paciente.idade = ler.nextInt();
		
		ler.close();
		
		System.out.println("O nome do paciente é " + paciente.nome + " e ele tem " + paciente.idade + " anos.");
		System.out.println("A frequência máxima do paciente é " + paciente.frequenciaMaxima() + 
				" e a frequência alvo é entre " + paciente.frequenciaAlvo()[0] + " e " +
				paciente.frequenciaAlvo()[1]);
	}

}
