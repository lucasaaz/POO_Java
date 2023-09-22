package Aula04;

public class Caneta {

	public String modelo;
	private String cor;
	private float ponta;
	private boolean tampada;

	public Caneta(String modelo, String cor, float ponta, boolean tampada) {
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.tampada = tampada;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	
	public void escrever() {
		if(this.tampada == true) {
			System.out.println(", então não pode escrever");
		}else {
			System.out.println(", então pode escrever");
		}
	}

	public void status() {
		System.out.println("O modelo da caneta é " + this.getModelo());
		System.out.println("A cor é " + this.getCor());
		System.out.println("A ponta é " + this.getPonta());
		System.out.printf("Ela esta tampada? " + this.isTampada());
		escrever();			
	}
	
}