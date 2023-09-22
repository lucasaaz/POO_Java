package Aula09;

public class Pessoa {
	//Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//Metodos
	public void fazerAniversario() {
		this.idade = this.idade + 1;
	}
	
	//Metodos Especiais
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String no) {
		this.nome = no;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int id) {
		this.idade = id;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String se) {
		this.sexo = se;
	}
	
}
