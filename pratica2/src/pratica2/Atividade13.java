package pratica2;

import java.util.Scanner;
public class Atividade13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int tipoApto, diarias, total = 0;
		
		System.out.println("informe o tipo de apto ultilizado, digite (1) para APTO SIMPLES ou digite (2) para APTO DUPLO: ");
		tipoApto = input.nextInt();
		System.out.println("informe o numero de diarias a ser cobrada: ");
		diarias = input.nextInt();
		
		if(tipoApto == 1) {
			if(diarias < 10) {
				total = 100 * diarias;
			}
			else if(diarias >= 10 && diarias <= 15) {
				total = 90 * diarias;
			}
			else {
				total = 80 * diarias;
			}	
		}
		else if(tipoApto == 2) {
			if(diarias < 10) {
				total = 140 * diarias;
			}
			else if(diarias >= 10 && diarias <=15) {
				total = 120 * diarias;
			}
			else {
				total = 100 * diarias;
			}
	
		}
		System.out.println("o valor total a ser cobrado e: R$" + total);
	}

}
