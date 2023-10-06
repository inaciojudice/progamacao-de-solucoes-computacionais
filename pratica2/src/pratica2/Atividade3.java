package pratica2;

import java.util.Scanner;
public class Atividade3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.println("informe a primeira nota do aluno: ");
		nota1 = input.nextDouble();
		System.out.println("informe a segunda nota do aluno: ");
		nota2 = input.nextDouble();
		System.out.println("informe a terceira nota do aluno: ");
		nota3 = input.nextDouble();
		
		media = (nota1  + nota2 + nota3) / 3;
		
		if(media >= 0 && media < 3) {
			System.out.println("Voce foi reprovado! ");
		}
		else if(media >= 3 && media < 7) {
			System.out.println("Voce esta em exame! ");
		}
		else if(media >= 7 && media <= 10) {
			System.out.println("Voce foi aprovado! ");
		}
		else {
			System.out.println("Nota invalida! ");
		}
		
		System.out.println(media);
		
	}

}
