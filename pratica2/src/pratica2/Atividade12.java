package pratica2;

import java.util.Scanner;
public class Atividade12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int idade, sexo;
		
		System.out.println("informe sua idade: ");
		idade = input.nextInt();
		System.out.println("informe seu sexo feminino digite(1) ou masculino digite(2): ");
		sexo = input.nextInt();
		
		if(sexo == 1) {
			if(idade <= 18) {
				System.out.println("sua mensalidade sera de: R$60,00. ");
			}
			else if(idade >= 19 && idade <= 25) {
				System.out.println("sua mesalidade sera de: R$90,00. ");
			}
			else if(idade >= 26 && idade <= 40) {
				System.out.println("sua mensalidade sera de: R$85,00. ");
			}
			else {
				System.out.println("sua mensalidade sera de: R$80,00. ");
			}
		}
		else if(sexo == 2) {
			if(idade <= 15) {
				System.out.println("sua mensalidade sera de: R$60,00. ");
			}
			else if(idade >= 16 && idade <= 18) {
				System.out.println("sua mensalidade sera de: R$75,00. ");
			}
			else if(idade >= 19 && idade <= 30) {
				System.out.println("sua mensalidade sera de: R$90,00. ");
			}
			else if(idade >= 31 && idade <= 40) {
				System.out.println("sua mensalidade sera de: R$85,00. ");
			}
			else {
				System.out.println("sua mensalidade sera de:  R$80,00. ");
			}

		}

	}

}
