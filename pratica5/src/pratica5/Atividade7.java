package pratica5;

import java.util.Scanner;
public class Atividade7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		double num = 0;
		double maiorNumero = Double.NEGATIVE_INFINITY, menorNumero = Double.POSITIVE_INFINITY;

		
		for(int i = 0; i < 10; i++) {
			System.out.println("informe um numero inteiro " + (i + 1) + ": ");
			num = input.nextInt();
		
			if(num > maiorNumero) maiorNumero = num;
			if(num < menorNumero) menorNumero = num;	
		}
		System.out.println("o maior numero inteiro informado e: " + maiorNumero);
		System.out.println("o menor numero inteiro informado e: " + menorNumero);
		
		input.close();
	}
}