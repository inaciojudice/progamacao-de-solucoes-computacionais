package atividadePratica1;

import java.util.Scanner;
public class Atividade8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double peso, segundo_peso, terceiro_peso;
		
		System.out.println("digite seu peso atual: ");
		peso = input.nextDouble();
		
		segundo_peso = (peso * 1.15);
		terceiro_peso = (peso * 0.80);
		
		System.out.println("seu peso engordando 15% sera: " + segundo_peso + ", seu peso emagrecendo 20% sera: " + terceiro_peso);
		
	}

}
