package Aula05;

public class Aula05 {

	public static void main(String[] args) {
		
		//Pessoa 01
		ContaBanco p1 = new ContaBanco(0, false);
		p1.setNumConta(1010);
		p1.setDono("Lucas");
		
		p1.abrirConta("CC");
		p1.pagarMensal();
		p1.depositar(250);
		p1.sacar(260);
		p1.estadoAtual();
		
		//Pessoa 02
		ContaBanco p2 = new ContaBanco(0, false);
		p2.setNumConta(2020);
		p2.setDono("Nirte");
		
		p2.abrirConta("cp");
		p2.pagarMensal();
		p2.sacar(50);
		p2.estadoAtual();
	}

}
