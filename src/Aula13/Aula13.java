package Aula13;

public class Aula13 {

	public static void main(String[] args) {
		//Mamifero
		Mamifero m = new Mamifero();
		m.emitirSom();
		
		//Lobo
		Lobo l = new Lobo();
		l.emitirSom();
		
		//Cachorro
		Cachorro c = new Cachorro();
		c.emitirSom();
		c.reagir("ola");
		c.reagir("fofo");
		c.reagir(11, 45);
		c.reagir(21, 00);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2, 12.50f);
		c.reagir(17, 4.50f);
	}

}
