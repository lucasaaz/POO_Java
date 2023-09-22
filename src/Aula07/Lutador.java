package Aula07;

public class Lutador {
	//Atributos
	private String nome;
	private String nacionalidae;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitoria;
	private int empate;
	private int derrota;
	
	//Metodos
	public void apresentar() {
		System.out.println("---------- APRESENTAÇÃO ----------");
		System.out.println("VEMMMM AIII, o lutador " + this.getNome());
		System.out.printf("diretamente de seu país de origem " + this.getNacionalidae());
		System.out.println(" com " + this.getIdade() + " anos de idade");
		System.out.printf("e " + this.getAltura() + "m de altura");
		System.out.println(" pesando " + this.getPeso() + "Kg.");
		System.out.printf("Tendo conquistado nessa Temporada 2021, " + this.getVitoria() + " vitóias, ");
		System.out.println( this.getEmpate() + " empates ");
		System.out.printf( this.getDerrota() + " e derrotas.");
		System.out.println("\n");
	}
	public void status() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Categoria: " + this.getCategoria());
		System.out.println("Vitórias: " + this.getVitoria());
		System.out.println("Empates: " + this.getEmpate());
		System.out.println("Derrotas: " + this.getDerrota());
		System.out.printf("\n");
	}
	public void ganharLuta() {
		setVitoria(getVitoria() + 1);
	}
	public void empatar() {
		setEmpate(getEmpate() + 1);
	}
	public void perderLuta() {
		setDerrota(getDerrota() + 1);
	}
	
	//Metodos Especiais 
	public Lutador( String no,
			        String na,
			        int id,
			        float al,
			        float pe,
			        int vi,
			        int em,
			        int de){
		
		this.setNome(no);
		this.setNacionalidae(na);
		this.setIdade(id);
		this.setAltura(al);
		this.setPeso(pe);
		this.setVitoria(vi);
		this.setEmpate(em);
		this.setDerrota(de);
		
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String no) {
		nome = no;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float pe) {
		peso = pe;
		setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria() {
		if(peso < 52.2) {
			categoria = "Inválido";
		}else if(peso < 70.3) {
			categoria = "Leve";
		}else if(peso < 83.9) {
			categoria = "Médio";
		}else if(peso <= 120.2) {
			categoria = "Pesado";
		}else {
			categoria = "Inválida";
		}
	}
	public String getNacionalidae() {
		return nacionalidae;
	}
	public void setNacionalidae(String nacionalidae) {
		this.nacionalidae = nacionalidae;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getVitoria() {
		return vitoria;
	}
	public void setVitoria(int vitoria) {
		this.vitoria = vitoria;
	}
	public int getEmpate() {
		return empate;
	}
	public void setEmpate(int empate) {
		this.empate = empate;
	}
	public int getDerrota() {
		return derrota;
	}
	public void setDerrota(int derrota) {
		this.derrota = derrota;
	}
	
	
	
	
}
