package pratica2;

import java.util.Scanner;
public class Atividade6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double valor1, valor2, valor3, somaDoisLados, moduloDoisLados;
		
		System.out.println("informe o primeiro valor: ");
		valor1 = input.nextDouble();
		System.out.println("informe o segundo valor: ");
		valor2 = input.nextDouble();
		System.out.println("informe o terceiro valor: ");
		valor3 = input.nextDouble();
		
		if(valor1 + valor2 > valor3 && (valor1 - valor2) * (-1) < valor3) {
			System.out.println("os valores informados podem ser os comprimentos dos lados de um triangulo.");
		}
		else {
			System.out.println("os valores informados nao podem ser os comprimentos dos lados de um triangulo." );
		}
		
		
	}

}
