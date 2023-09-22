package Aula10;

public class Aluno extends Pessoa{
	//Atributs 
	private int matr;
	private String curso;
	
	//Metodos
	public void cancelarMatr() {
		System.out.println("Matricula será cancelada");
	}
	
	//Metodos Especiais
	public int getMatr() {
		return matr;
	}

	public void setMatr(int ma) {
		this.matr = ma;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String cu) {
		this.curso = cu;
	}
	
}
