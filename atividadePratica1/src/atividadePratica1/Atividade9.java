package atividadePratica1;

import java.util.Scanner;
public class Atividade9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double a, b, c, d;
		
		System.out.println("digite o primeiro cateto: ");
		a = input.nextDouble();
		System.out.println("digite o terceiro cateto: ");
		b = input.nextDouble();
		c = (b * 2 * 2) + (a * 2 * 2);
		d = Math. sqrt(c);
		
		System.out.println("o valor da hipotenusa e: " + d);

		
	}

}
