package Aula14;

public class Visualizacao {
	//Atributos para as classes
	private Gafanhoto espectador;
	private Video filme;
	
	//Metodos 
	public void avaliar() {
		this.filme.setAvaliacao(5);
	}
	public void avaliar(int nota) {
		this.filme.setAvaliacao(nota);
	}
	public void avaliar(float porc) {
		float tot = 0;
		if( porc <= 30) {
			tot = 3;
		}else if(porc <= 50) {
			tot = 5;
		}else if(porc <= 90) {
			tot = 8;
		}else if(porc <= 100) {
			tot = 10;
		}
		this.filme.setAvaliacao(tot);
	}

	//Metodos Especiais
	public Visualizacao(Gafanhoto espectador, Video filme) {
		this.espectador = espectador;
		this.filme = filme;
		this.filme.setViews(this.filme.getViews()+1);
		this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
	}
	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}
	@Override
	public String toString() {
		return "Visualizacao {espectador -> " + espectador + "   ------->    filme -> " + filme + "}";
	}
	
}
