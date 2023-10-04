package atividadePratica1;

import java.util.Scanner;
public class Atividade6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double celsius, fahrenheit;
		
		System.out.println("digite a temperatura em celssius para ser convertida em fahrenheit");
		celsius = input.nextDouble();
		
		fahrenheit = (celsius * 1.8) + 32;
		
		System.out.println("a temperatura em fahrenheit fica: " + fahrenheit);
		
		
	}

}
