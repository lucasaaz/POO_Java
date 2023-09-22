package Aula11;

public class Aluno extends Pessoa{
	private int matricula;
	private String curso;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int ma) {
		this.matricula = ma;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String cur) {
		this.curso = cur;
	}

	public void PagarMensalidade() {
		System.out.println("Pagamento da Mensalidade do aluno " + this.getNome() + " efetuada, Parabens!!");
	}
}
