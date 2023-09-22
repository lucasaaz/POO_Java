package Aula12;

public class Aula12 {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Canguru c = new Canguru();
		//Repitil r = new Repitil();
		//Ave a = new Ave();
		
		c.locomover();
		m.setCorPelo("Marrom");
		m.setIdade(2);
		m.setMembros(4);
		m.setPeso(35.3f);
		m.alimentar();
		m.emitirSom();
		m.locomover();
	}

}
