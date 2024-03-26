package exercicio_04;

public class Main {
	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		conta1.setNumeroDaConta(1234);
		int numero = conta1.getNumeroDaConta();
		
		System.out.println("Número da Conta: " + numero);
		conta1.verSaldo();
		
		conta1.depositar(600);
		conta1.sacar(1000);
		conta1.sacar(100);
		
		conta1.verSaldo();
	}
}
