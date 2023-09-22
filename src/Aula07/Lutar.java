package Aula07;

import java.util.Random;

public class Lutar {
	//Atributos
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovado;
	
	//Metodos
	public void marcarLuta(Lutador l1, Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.aprovado = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
			System.out.println("Luta impossivel de acontecer!");
		}
	}
	public void lutar() {
		this.desafiado.apresentar();
		this.desafiante.apresentar();
		
		Random aleatorio = new Random();
		int resultado = aleatorio.nextInt(3);
		switch(resultado) {
		case 0:
			this.desafiado.empatar();
			this.desafiante.empatar();
			System.out.println("Luta EMPATADA!");
			System.out.printf("\n");
			break;
		case 1:
			this.desafiado.ganharLuta();
			this.desafiante.perderLuta();
			System.out.println("O lutador " + this.desafiado.getNome() + " VENDEU!");
			System.out.printf("\n");
			break;
		case 2:
			this.desafiado.perderLuta();
			this.desafiante.ganharLuta();
			System.out.println("O lutador " + this.desafiante.getNome() + " VENCEU!");
			System.out.printf("\n");
			break;
		}
		
	}
	
	//Metodos Especiais
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador dd) {
		this.desafiado = dd;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador da) {
		this.desafiante = da;
	}
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean ap) {
		this.aprovado = ap;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int ro) {
		this.rounds = ro;
	}
	
	
}
