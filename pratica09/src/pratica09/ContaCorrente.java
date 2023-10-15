package pratica09;

import java.util.Scanner;

public class ContaCorrente {
	private int numero, agencia;
	private double saldo;

	public void iniciarContaCorrente(int n, int ag) {
		numero = n;
		agencia = ag;
		saldo = 0;
	}

	public void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Saldo insuficiente. Não é possível sacar o valor especificado.");
		} else {
			saldo = saldo - valor;
		}
	}

	public void depositar(double valor) {
		saldo = saldo + valor;
	}

	public double consultarSaldo() {
		return saldo;
	}

	public void exibe() {
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + numero);
		System.out.println("Saldo: R$ " + saldo);
	}
}

class Main {
	public static void main(String[] args) {
		ContaCorrente contaCorrente;
		contaCorrente = new ContaCorrente();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o número da conta: ");
		int numeroConta = scanner.nextInt();
		System.out.print("Informe o número da agência: ");
		int numeroAgencia = scanner.nextInt();

		contaCorrente.iniciarContaCorrente(numeroConta, numeroAgencia);

		System.out.print("Informe o valor do depósito: ");
		double valorDeposito = scanner.nextDouble();
		contaCorrente.depositar(valorDeposito);

		System.out.println("Dados da conta após o depósito:");
		contaCorrente.exibe();

		System.out.print("Informe o valor do saque: ");
		double valorSaque = scanner.nextDouble();
		contaCorrente.sacar(valorSaque);

		System.out.println("Dados da conta após o saque:");
		contaCorrente.exibe();

		scanner.close();
	}
}

