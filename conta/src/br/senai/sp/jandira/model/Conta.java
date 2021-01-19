package br.senai.sp.jandira.model;

public class Conta {
	
	private String tipo;
	private double saldo;
	public String numero;
	public String titular;
	public boolean ativa;
	public double chequeEspecial;
	
	//**metodos de acesso aos atributos da classe
	// getter and setters 
	
	public void setTipo(String tipo) {
		
	if (tipo.equals ("corrente") || tipo.equals ("poupan�a")) {
		this.tipo = tipo;
	} else { 
		System.out.println (" o tipo deve ser corrente ou poupan�a ");
		}
	
	public void depositar(double valorDeposito) {
		
		if (valorDeposito < 0) {
			System.out.println("Valor inv�lido!!!");
		} else {
			saldo += valorDeposito;
		}
		
	}
	
	public void mostrarSaldoDaConta() {
		System.out.println("Saldo: " + saldo);
		System.out.println("Saldo + Limite: " + (saldo + chequeEspecial));
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void sacar(double valorDoSaque) {
		
		if ((saldo + chequeEspecial) >= valorDoSaque) {
			saldo -= valorDoSaque;
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		
	}
	
	public void transferir() {
		
	}

}
