package pratica5;

import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("informe um numero: ");
		int num = input.nextInt();
		
		if(num < 0) {
			System.out.println("numero invalido. ");
		} 
		else {
			long fatorial = 1;
			for(int i = 1; i <= num; i++) {
				fatorial *= i;
			}
			System.out.printf("o fatorial de %d e %d", num, fatorial);
		}
		input.close();

	}

}
