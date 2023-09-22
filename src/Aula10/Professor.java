package Aula10;

public class Professor extends Pessoa{
	//Atributo
	private String especialidade;
	private float salario;
	
	//Metodos
	public void receberAum(float aum) {
		this.salario = this.getSalario() + aum;
	}

	//Metodos Especiais 	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String es) {
		this.especialidade = es;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float sa) {
		this.salario = sa;
	}
	
}
