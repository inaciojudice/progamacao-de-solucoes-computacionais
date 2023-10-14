package pratica5;

import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("digite um numero: ");
		numero1 = input.nextInt();
		System.out.println("digite um segundo numero: ");
		numero2 = input.nextInt();
		
		for (int i = numero1; i <= numero2; i++)
			System.out.println(i);
		
		input.close();

	}

}
