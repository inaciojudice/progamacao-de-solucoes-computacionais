package atividadePratica1;

import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {

		Scanner input = new Scanner( System.in );
		
		int nascimento, anoatual, idade, idadefutura;
		
		System.out.println("em que ano voce nasceu? ");
		nascimento = input.nextInt();
		System.out.println("qual o ano atual? ");
		anoatual = input.nextInt();
		
		idade = (anoatual - nascimento);
		idadefutura = (2050 - nascimento);
		
		System.out.println("sua idade hoje e: " + idade);
		System.out.println("sua idade em 2050 sera: " + idadefutura);
		
	}

}
