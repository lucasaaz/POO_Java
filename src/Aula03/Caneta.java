package Aula03;

public class Caneta {
	
	public String modelo;
	public String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	public void status() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Cor da Caneta é " + this.cor);
		System.out.println("Pontas: " + this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada? " + this.tampada);
	}
	
	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void rabiscar() {
		if( this.tampada == true) {
			System.out.println("Não pode Rabiscar");
		}else {
			System.out.println("Rabiscar");
		}
	}
	

}
