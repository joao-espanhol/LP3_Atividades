package exercicio_04;

public class ContaBancaria {
	private int numeroDaConta;
	private double saldo;
	
	public ContaBancaria() {
		saldo = 100.00;
	}
	
	public void setNumeroDaConta(int numero) {
		numeroDaConta = numero;
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void depositar(double valor) {
		if (valor < 0.0) {
			System.out.println("Valor Inválido!");
		} else {
			saldo += valor;
			System.out.println("Depósito Efetuado!");
		}
	}
	
	public void sacar(double valor) {
		if (valor < 0.0 || valor > saldo) {
			System.out.println("Valor Inválido!");
		} else {
			saldo -= valor;
			System.out.println("Saque Efetuado!");
		}
	}
	
	public void verSaldo() {
		System.out.println("Saldo: " + saldo);
	}
}
