package Aula06;

public class ControleRemoto implements Controlador {
	
	//Atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	
	//Metodos Especiais
	public ControleRemoto() { //Construtor
		this.setLigado(false);
		this.setVolume(50);
		this.setTocando(false);
		
	}
	
	private int getVolume() {
		return volume;
	}
	private void setVolume(int v) {
		this.volume = v;
	}
	private boolean getLigado() {
		return ligado;
	}
	private void setLigado(boolean l) {
		this.ligado = l;
	}
	private boolean getTocando() {
		return tocando;
	}
	private void setTocando(boolean t) {
		this.tocando = t;
	}

	
	//Metodos Abstratos
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
		if (this.getLigado() == true ) {
			System.out.println("A TV está: " + this.getLigado());
			System.out.println("A TV está: " + this.getTocando());
			System.out.printf("Volume: " + this.getVolume());
			for (int i = 0; i <= this.getVolume(); i+=10 ) {
				System.out.printf("|");
			}
			System.out.println("\n");
		}else {
			if (this.getLigado() == false ) {
				System.out.println("Erro!");
			}
		}
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		if (this.getLigado() == true ) {
			System.out.println("Fechando Menu...");
		}else {
			if (this.getLigado() == false ) {
				System.out.println("Erro!");
			}
		}
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getTocando() ) {
			this.setVolume(this.getVolume() + 1);
			System.out.println("Volume: " + this.getVolume());
		}else {
			System.out.println("Confere se a TV está ligado ou no modo Pause!");
		}
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getTocando() == true ) {
			this.setVolume(this.getVolume() - 1);
			System.out.println("Volume: " + this.getVolume());
		}
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getVolume() != 0 ) {
			this.setVolume(0);
			System.out.println("Mudo ativado");
		}
	}

	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		if (this.getLigado() == true && this.getVolume() == 0 ) {
			this.setVolume(50);
			System.out.println("Mudo destivado");
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getTocando() == false ) {
			this.setTocando(true);
			System.out.println("Play");
		}
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getTocando() )
			this.setTocando(false);
		System.out.println("Pause");
	}
	
	
}
