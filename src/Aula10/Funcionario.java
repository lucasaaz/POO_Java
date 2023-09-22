package Aula10;

public class Funcionario extends Pessoa{
	//Atributos
	private String setor;
	private boolean trabalhando;
	public String getSetor() {
		return setor;
	}
	
	//Metodos
	public void mudarTrabalho() {
		this.trabalhando =! this.trabalhando;
	}
	
	//Metodos Especiais
	public void setSetor(String se) {
		this.setor = se;
	}
	public boolean getTranlhando() {
		return trabalhando;
	}
	public void setTranlhando(boolean tr) {
		this.trabalhando = tr;
	}	
	
}
