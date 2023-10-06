package pratica2;

import java.util.Scanner;
public class Atividade11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int diaria = 500;
		int taxaServico, dias, total;
	
		System.out.println("informe o numero de diarias a ser cobrado: ");
		dias = input.nextInt();
		
		if(dias < 15) {
			taxaServico = 15 * dias;
		}
		else if(dias == 15) {
			taxaServico = 10 * dias;
		}
		else {
			taxaServico = 5 * dias;
		}
		
		total = (diaria * dias) + taxaServico;
		
		System.out.println("a conta total foi de: " + total);
		
		
	}

}
