package pratica2;


import java.util.Scanner;
public class Atividade7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double a, b, c, raizReal, delta, x1, x2;
		
		System.out.println("informe o valor do coeficiente (a): ");
		a = input.nextDouble();
		System.out.println("informe o valor do coeficiente (b): ");
		b = input.nextDouble();
		System.out.println("informe o valor do coeficiente (c): ");
		c = input.nextDouble();
		
		delta = Math.pow(b, 2) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta) / (2 * a));
		x2 = (-b - Math.sqrt(delta) / (2 * a));
		
		if(a == 0 && b == 0 && c == 0) {
			System.out.println("Igualdade confiramda 0 = 0. ");
		}
		else if(a == 0 && b == 0 && c != 0) {
			System.out.println("coeficientes informados incorretamente. ");
		}
		else if(a == 0 && b != 0) {
			System.out.println("Esta e uma equacao de primeiro grau. ");
			raizReal = (-c / b);
			System.out.println("O valor da raiz real e: " + raizReal);
		}
		else if(a != 0) {
			System.out.println("esta e uma equacao de segundo grau. ");
			if(delta < 0) {
				System.out.println("Esta equacao nao possui raizes reais. ");
			}
			if(delta == 0) {
				System.out.println("esta equacao possui duas raizes reais iguais.");
				double x = (-b / 2 * a);
				System.out.println("o valor da raiz da equacao e: " + delta);
			}
			if(delta > 0) {
				System.out.println("Esta equacao possui duas raizes reais. ");
				System.out.println("o valor das equacoes sao: " + x1 + ", " + x2);
			}
		}
		

	}
}