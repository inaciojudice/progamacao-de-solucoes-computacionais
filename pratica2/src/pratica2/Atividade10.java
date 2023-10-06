package pratica2;

import java.util.Scanner;
public class Atividade10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double numero1, numero2, soma, multiplicacao, subtracao, divisao;
		
		System.out.println("informe o primeiro numero: ");
		numero1 = input.nextDouble();
		System.out.println("informe o segundo numero: ");
		numero2 = input.nextDouble();
		
		soma = numero1 + numero2;
		multiplicacao = numero1 * numero2;
		
		if(numero1 > numero2) {
			subtracao = numero1 - numero2;
		}
		else if(numero1 < numero2) {
			subtracao = numero2 - numero1;
		}
		else {
			subtracao = 0;
		}
		if(numero1 == 0 || numero2 == 0) {
			divisao = 0;
		}
		else {
			divisao = numero1 / numero2;
		}
		
		System.out.println("soma = " + soma);
		System.out.println("multiplicacao = " + multiplicacao);
		System.out.println("subtracao = " + subtracao);
		System.out.println("divisao = " + divisao);
	}

}
