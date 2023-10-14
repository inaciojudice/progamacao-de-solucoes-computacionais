package pratica5;

import java.util.Scanner;
public class Atividade5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double maiorNumero = Double.NEGATIVE_INFINITY, menorNumero = Double.POSITIVE_INFINITY;
		double entrada;
		
		while(true) {
			System.out.println("informe um numero inteiro positivo, (ou negativo para sair): ");
			entrada = input.nextDouble();
			if(entrada < 0) break;
			
			if(entrada > maiorNumero) maiorNumero = entrada;
			if(entrada < menorNumero) menorNumero = entrada;	
		}
		
		System.out.println("o maior numero inteiro informado e: " + maiorNumero);
		System.out.println("o menor numero inteiro informado e: " + menorNumero);

		input.close();
	}

}
