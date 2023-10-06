package pratica2;

import java.util.Scanner;
public class Atividade4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double peso, altura, imc;
		
		System.out.println("Informe seu peso em KG: ");
		peso = input.nextDouble();
		System.out.println("Informe sua altura em metros: ");
		altura = input.nextDouble();
		
		imc = peso / (Math.pow(altura, 2));
		
		if(imc < 20) {
			System.out.println("Voce esta abaixo do peso! ");
		}
		else if(imc >= 20 && imc <= 25) {
			System.out.println("Voce esta no peso normal! ");
		}
		else if(imc > 25 && imc <= 30) {
			System.out.println("Voce esta em sobrepeso!");
		}
		else if(imc > 30 && imc <= 40) {
			System.out.println("Voce esta em obesidade! ");
		}
		else {
			System.out.println("Obesidade morbida!  ");
		}
		
	}

}
