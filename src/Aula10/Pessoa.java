package Aula10;

public class Pessoa {
	//Atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//Metodos
	public void fazerAniv() {
		this.idade++;
	}

	//Metodos Especiais
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

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	//toString
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
		
}
