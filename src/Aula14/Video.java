package Aula14;

public class Video implements AcoesVideo {
	//Atributos
	private String titulo;
	private float avaliacao;
	private float views;
	private int curtidas;
	private boolean reproduzindo;
	
	//Metodos Abstratos
	@Override
	public void play() {
		this.setReproduzindo(true);
	}
	@Override
	public void pause() {
		this.setReproduzindo(false);
	}
	@Override
	public void like() {
		this.setCurtidas(this.getCurtidas()+1);
	}
	
	//Metodos Especiais
	public Video(String titulo) {
		super();
		this.titulo = titulo;
		this.avaliacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	
	public boolean getReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	public float getViews() {
		return views;
	}
	public void setViews(float views) {
		this.views = views;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(float avaliacao) {
		int nova;
		nova = (int) ((int)(this.getAvaliacao()+avaliacao) / this.getViews()) ;
		this.avaliacao = nova;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	@Override
	public String toString() {
		return "Video(titulo = " + titulo + ", avaliacao = " + avaliacao + ", views = " + views + ", curtidas = " + curtidas
				+ ", reproduzindo = " + reproduzindo + ")";
	}
	
}
