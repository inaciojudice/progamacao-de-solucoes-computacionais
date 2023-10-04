package atividadePratica1;

import java.util.Scanner;
public class Atividade10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double comprimento, area, volume, raio;
		
		System.out.println("digite o raio:");
		raio = input.nextDouble();
		
		comprimento = (Math.PI * 2 * raio);
		area = (Math.PI * (raio * 2 * 2));
		volume = (Math.PI * (3/4) * (raio * 2 * 2 * 2));
		
		System.out.println("o comprimento e de: " + comprimento);
		System.out.println("A area e de: " + area);
		System.out.println("o volume e de: " + volume);
	}

}
