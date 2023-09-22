package Aula09;

public class Livro implements Publicacao {
	//Atributos
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	//Metodos 
	public String detalhes() {
		return "titulo = " + titulo + "\nautor = " 
				+ autor + "\ntotPaginas = " + totPaginas 
				+ "\npagAtual = " + pagAtual + "\naberto = " 
				+ aberto + "\nleitor = " + leitor.getNome() 
				+ "," + leitor.getIdade() + "," + leitor.getSexo();
	}

	//Metodos Especiais 
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String ti) {
		this.titulo = ti;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String au) {
		this.autor = au;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int to) {
		this.totPaginas = to;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int at) {
		this.pagAtual = at;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean ab) {
		this.aberto = ab;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa le) {
		this.leitor = le;
	}

	//Implementacoes
	@Override
	public void abrir() {
		this.aberto = true;
	}

	@Override
	public void fechar() {
		this.aberto = false;
	}

	@Override
	public void folhear(int p) {
		if(this.aberto == true && p <= this.totPaginas) {
			this.pagAtual = p;
		}else if(this.aberto == false){
			System.out.println("Livro esta fechado, impossivel folhear !\n");
		}else if(p > this.totPaginas) {
			System.out.println("Numero de paginas insuficiente !\n");
		}
	}

	@Override
	public void avancarPag() {
		if(this.aberto == true && this.pagAtual < this.totPaginas) {
			this.pagAtual++;
		}else if(this.aberto == false) {
			System.out.println("Livro esta fechado, impossivel avancar !\n");
		}else if(this.pagAtual >= this.totPaginas) {
			System.out.println("Voce terminou de ler o livro, parabens!! \nEaii, gostou do livro?\n");
		}
	}

	@Override
	public void voltarPag() {
		if(this.aberto == true && this.pagAtual > 1) {
			this.pagAtual--;
		}else if(this.aberto == false){
			System.out.println("Livro esta fechado, impossivel voltar !");
		}else if(this.pagAtual <= 1) {
			System.out.println("Livro fechado !\n");
			this.pagAtual = 0;
		}
	}

	
	
}
