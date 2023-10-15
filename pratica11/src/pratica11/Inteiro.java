package pratica11;

import java.util.Scanner;

public class Inteiro {
	public int multiplicacao(int a, int b) {
		int resultado = 0;
		for (int i = 0; i < b; i++) {
			resultado += a;
		}
		return resultado;
	}

	public int potencia(int a, int b) {
		int resultado = 1;
		for (int i = 0; i < b; i++) {
			resultado = multiplicacao(resultado, a);
		}
		return resultado;
	}

	public int divisao(int a, int b) {
		int quociente = 0;
		while (a >= b) {
			a = a - b;
			quociente++;
		}
		return quociente;
	}

	public int resto(int a, int b) {
		while (a >= b) {
			a = a - b;
		}
		return a;
	}

	public boolean par(int a) {
		return resto(a, 2) == 0;
	}

	public static void main(String[] args) {
		Inteiro inteiro = new Inteiro();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Multiplicação");
			System.out.println("2 - Potência");
			System.out.println("3 - Divisão");
			System.out.println("4 - Par");
			System.out.println("5 - Sair");

			int escolha = scanner.nextInt();

			if (escolha == 5) {
				System.out.println("Saindo do programa.");
				break;
			}

			int a, b;

			switch (escolha) {
			case 1:
				System.out.print("Digite o primeiro número: ");
				a = scanner.nextInt();
				System.out.print("Digite o segundo número: ");
				b = scanner.nextInt();
				System.out.println("Resultado: " + inteiro.multiplicacao(a, b));
				break;
			case 2:
				System.out.print("Digite a base: ");
				a = scanner.nextInt();
				System.out.print("Digite o expoente: ");
				b = scanner.nextInt();
				System.out.println("Resultado: " + inteiro.potencia(a, b));
				break;
			case 3:
				System.out.print("Digite o dividendo: ");
				a = scanner.nextInt();
				System.out.print("Digite o divisor: ");
				b = scanner.nextInt();
				System.out.println("Quociente: " + inteiro.divisao(a, b));
				System.out.println("Resto: " + inteiro.resto(a, b));
				break;
			case 4:
				System.out.print("Digite o número: ");
				a = scanner.nextInt();
				System.out.println("É par? " + inteiro.par(a));
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
		scanner.close();
	}
}
