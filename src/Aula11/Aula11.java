package Aula11;

public class Aula11 {

	public static void main(String[] args) {
		//Visitante v1 = new Visitante();
		Aluno a1 = new Aluno();
		Bolsista b1 = new Bolsista();

		a1.setCurso("Engenharia");
		a1.setIdade(20);
		a1.setMatricula(1111);
		a1.setNome("Lucas");
		a1.setSexo("M");
		a1.fazerAniv();
		a1.fazerAniv();
		a1.PagarMensalidade();
		System.out.println(a1.toString());
		
		b1.setNome("Thales");
		b1.setSexo("M");
		b1.setCurso("Educação Física");
		b1.setIdade(30);
		b1.RenovarBolsa();
		b1.fazerAniv();
		b1.PagarMensalidade();
		System.out.println(b1.toString());
	}

}
