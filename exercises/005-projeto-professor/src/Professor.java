
public class Professor {
	String nome;
	int aulasSemanais;
	double valorHoraAula;
	
	public double salario() {
		double salarioBase = aulasSemanais * valorHoraAula * 4.5;
		double adicionalHoraAtividade = salarioBase * 0.5;
		double descansoSemanalRemunerado = (1/6) * (salarioBase + adicionalHoraAtividade);
		return salarioBase + adicionalHoraAtividade + descansoSemanalRemunerado;
	}
}
