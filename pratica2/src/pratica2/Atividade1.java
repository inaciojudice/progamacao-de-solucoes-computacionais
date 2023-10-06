package pratica2;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.println("qual a sua primeira nota? ");
		nota1 = input.nextDouble();
		System.out.println("qual a sua segunda nota? ");
		nota2 = input.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("voce foi aprovado!! ");
		}
		else {
			System.out.println("voce foi reprovado!! ");
		}
	}

}
