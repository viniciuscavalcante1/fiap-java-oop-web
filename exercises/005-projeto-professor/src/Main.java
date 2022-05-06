import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int NPROFESSORES = 3;
		Scanner ler = new Scanner(System.in);
		
		Professor[] professores = new Professor[NPROFESSORES];
		
		for(int i = 0; i < NPROFESSORES; i++) {
			professores[i] = new Professor();
			System.out.println("Nome: ");
			professores[i].nome = ler.next();
			System.out.println("Aulas por semana: ");
			professores[i].aulasSemanais = ler.nextInt();
			System.out.println("Valor da hora de aula: ");
			professores[i].valorHoraAula = ler.nextDouble();			
		}
		
		ler.close();
		
		for(int i = 0; i < NPROFESSORES; i++) {
			System.out.println("O(a) professor(a) " + professores[i].nome + " recebe R$" + professores[i].salario() +
					" de salário bruto.");
		}
		
	}

}
