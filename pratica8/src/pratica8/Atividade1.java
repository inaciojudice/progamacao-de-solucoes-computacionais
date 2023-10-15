package pratica8;

import java.util.Scanner;
public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double total;
		
		System.out.print("quantos valores deseja somar? ");
		int quantidadeDePrecos = input.nextInt();

		total = somarPrecos(quantidadeDePrecos);

		System.out.println("o total dos valores: " + total);
	}

	public static double somarPrecos(int totalValores) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		double preco;
		
		for (int i = 1; i <= totalValores; i++) {
			System.out.print("informe o valor do produto " + i + ": ");
			preco = input.nextDouble();
			total += preco;
		}

		return total;
	}

}
