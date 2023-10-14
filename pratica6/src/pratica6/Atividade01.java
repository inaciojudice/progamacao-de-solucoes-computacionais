package pratica6;

import java.util.Scanner;
public class Atividade01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] numeros = new int[10];
        int somaPares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("digite o " + (i+1) + " numero:");
            numeros[i] = input.nextInt();
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }

        System.out.println("os numeros digitados foram:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("a soma dos numeros pares e: " + somaPares);
		
        input.close();
	}

}
