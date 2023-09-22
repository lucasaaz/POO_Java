package Aula05;

public class ContaBanco {
	
	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	//Construtor
	public ContaBanco(float saldo, boolean status){
		setSaldo(0);
		setStatus(false);
	}
	
	
	//Metodo Inicial
	public void estadoAtual() {
		System.out.println("\n-----STATUS BANCÁRIO-----");
		System.out.println(" Conta: " + this.getNumConta());
		System.out.println(" Tipo de conta: " + this.getTipo());
		System.out.println(" Usuário: " + this.getDono());
		System.out.println(" Status da conta: " + this.isStatus());
		System.out.printf(" Saldo da conta: R$" + this.getSaldo() + "0");
		System.out.println("\n-------------------------");
	}
	
	//Metodos
	public void abrirConta(String t){
		//Receber o tipo
		setTipo(t);
		//Ativar a conta
		setStatus(true); 
		if( t == "CC" || t == "cc"){
			this.setSaldo(50);
		}else {
			if( t == "CP" || t == "cp") {
				this.setSaldo(150);
			}
		}
		System.out.println("Conta aberta com sucesso, Bem-Vindo " + this.getDono() + "!");
	}
	public void fecharConta(){
		if( this.getSaldo() > 0){
			System.out.println("Ainda a dinheiro na conta, por favor conferir seu saldo!");			
		}else {
			if( this.getSaldo() < 0){
				System.out.println("Sua conta está em débito, por favor conferir seu saldo");
			}else {
				setStatus(false);
				System.out.println("Conta fechada com sucesso");
			}
		}
	}
	public void depositar(float sal){
		if( this.isStatus()){
			this.setSaldo(this.getSaldo() + sal);
			System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
		}else {
			System.out.println("Vocẽ precisar ter uma conta para pode fazer um depósito!");
		}
	}
	public void sacar(float sal){		
		if( isStatus() && getSaldo() > sal){
			setSaldo(getSaldo() - sal);
			System.out.println("Saque realizado com sucesso da conta de " + this.getDono());
		}else {
			System.out.println("Não foi possivel fazer o saque desse valor, por favor conferir seu saldo ou abra uma conta!");
		}
	}
	public void pagarMensal(){
		//Valor da mensalidadde
		int cc;
		int cp;
		
		if( isStatus()){
		if( this.getTipo() == "CC" || this.getTipo() == "cc"){
			cc = 12;
			this.setSaldo(getSaldo() - cc);
			System.out.println("Mensalidae paga com sucesso por " + this.getDono());
		}else {
			if( this.getTipo() == "CP" || this.getTipo() == "cp"){
				cp = 20;
				this.setSaldo(this.getSaldo() - cp);
				System.out.println("Mensalidae paga com sucesso por " + this.getDono());
			}
		}
		}else {
			if( this.isStatus()){
				System.out.println("Você não possui uma conta!");
			}
		}
	}
	
	
	//Metodos Especiais 
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int n) {
		this.numConta = n;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float sal) {
		this.saldo = sal;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean s) {
		this.status = s;
	}
		
	
}
