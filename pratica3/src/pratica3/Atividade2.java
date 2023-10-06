package pratica3;

import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int matricula, nota1, nota2, nota3, media;
		
		while(true) {
			System.out.println("informe a matricula do aluno (ou digite um numero negativo para sair.): ");
			matricula = input.nextInt();
			if(matricula < 0) break;
			
			System.out.println("informe a primeira nota do aluno: ");
			nota1 = input.nextInt();
			System.out.println("informe a segunda nota do aluno: ");
			nota2 = input.nextInt();
			System.out.println("informe a terceira nota do aluno: ");
			nota3 = input.nextInt();
			
			media = (nota1 + nota2 + nota3) / 3;
			
			if(media >= 70) {
				System.out.println("voce foi aprovado!! ");
			}
			if(media >= 60 && media < 70) {
				System.out.println("voce esta em recuperacao!! ");
			}
			if(media < 60) {
				System.out.println("voce foi reprovado!! ");
			}
			
			
		}
		
		
	}

}
