package pratica6;

import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
        double[] numeros = new double[10];
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        
		for(int i = 0; i < 10; i++) {
			System.out.println("digite o " + (i+1) + " numero: ");
			numeros[i] = input.nextDouble();
			
			if(numeros[i] < min) {
				min = numeros[i];
			}
			if(numeros[i] > max) {
				max = numeros[i];
			}
		}
		
		System.out.println("vetor: ");
		for(int i = 0; i < 10; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("o maior numero e: " + max);
		System.out.println("o menor numero e: " + min);
		
		input.close();
	}

}
