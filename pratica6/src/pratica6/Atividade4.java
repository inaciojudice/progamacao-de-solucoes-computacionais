package pratica6;

import java.util.Scanner;
public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double [] numeros = new double[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("digite o " + (i+1) + " numero: ");
			numeros[i] = input.nextDouble();
		}
		
		System.out.println("numeros nas posicoes pares: ");
		for(int i = 0; i < 10; i += 2) {
			System.out.println(numeros[i]);
		}
		
		input.close();
	}

}
