package Aula11;

public class Bolsista extends Aluno{
	private int bolsa;
	
	public int getBolsa() {
		return bolsa;
	}
	public void setBolsa(int bo) {
		this.bolsa = bo;
	}
	
	public void RenovarBolsa() {
		System.out.println("Bolsa do aluno " + this.getNome() + " renovada, Parabens!!");
	}
	
	@Override
	public void PagarMensalidade() {
		System.out.println("Pagamento da Mensalidade do bolsista " + this.getNome() + " efetuada, Parabens!!");
	}
}
