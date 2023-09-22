package Aula09;

public class Aula09 {

	public static void main(String[] args) {
		Pessoa[] P = new Pessoa[2];
		Livro[] L = new Livro[3];
		
		//Pessoas
		P[0] = new Pessoa("Lucas", 20, "Masculino");
		P[1] = new Pessoa("Maria", 25, "Feminino");
		
		//Livros
		L[0] = new Livro("Aprendendo Java", "Jose da Silva", 300, P[0]);
		L[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, P[1]);
		L[2] = new Livro("Java Avancado", "Maria Candido", 500, P[0]);
		
		//Acao
		L[0].abrir();
		L[0].folhear(0);
		L[0].avancarPag();
		L[0].avancarPag();
		L[0].voltarPag();
		L[0].voltarPag();
		L[0].voltarPag();
		System.out.println(L[0].detalhes());
		
	}

}
