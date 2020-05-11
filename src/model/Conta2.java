package model;

public class Conta2 {
	private String cpf;
	private int numeroConta;
	private int dv;
	private double saldo;
	
	
	public Conta2(String cpf, int numConta, int dv) {
		this.cpf = cpf;
		this.numeroConta = numConta;
		this.dv = dv;
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}
	public boolean debitar(double valor) {
		if(valor > saldo){
			return false;
		}
		else{
			this.saldo -= valor;
			return true;
		}
	}
	
	
	public boolean transferir(double valor, Conta2 outra) {
		if(saldo >= valor) {
			this.debitar(valor); //this.saldo = this.saldo - valor;
			outra.creditar(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getDv() {
		return dv;
	}
	public void setDv(int dv) {
		this.dv = dv;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String exibirInfo() {
		return "Conta "+this.numeroConta+"/"+this.dv+" CPF "+this.cpf+" saldo "+this.saldo;
	}
	

}
