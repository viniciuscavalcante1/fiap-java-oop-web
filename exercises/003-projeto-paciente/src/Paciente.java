
public class Paciente {
	String nome;
	int idade;
	
	public int frequenciaMaxima() {
		return 220 - idade;
	}
	
	public double[] frequenciaAlvo() {
		double[] alvo = new double[2];
		
		alvo[0] = frequenciaMaxima() * 0.5;
		alvo[1] = frequenciaMaxima() * 0.85;
		
		return alvo;
	}
}
