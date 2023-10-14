package pratica5;

import java.util.Scanner;
public class Atividade4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int idade, somaIdade = 0, contador = 0;
		double media;
		
		while(true) {
			System.out.println("informe uma idade ou digite um numero negativo para sair: ");
			idade = input.nextInt();
			if(idade < 0 ) break;
			
			somaIdade += idade;
			contador ++;	
		}
		if(contador > 0) {
			media = somaIdade / contador;
			System.out.println("a media das idade informadas e: " + media);
		}
		else {
			System.out.println("nenhuma idade foi informada. ");
		}
		
		input.close();
		
	}

}
