package pratica6;

import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double [] numeros = new double[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("digite o " + (i+1) + " numero: ");
			numeros[i] = input.nextDouble();
		}
		
		System.out.println("vetor: ");
		for(int i = 0; i < 10; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("posicoes dos numeros negativos: ");
		for(int i = 0; i < 10; i++) {
			if(numeros[i] < 0) {
				System.out.println(i);
			}
		}
		
		input.close();
	}

}
