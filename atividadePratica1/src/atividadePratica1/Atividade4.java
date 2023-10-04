package atividadePratica1;

import java.util.Scanner;
public class Atividade4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario, aumento;
		System.out.println("digite seu salario atual: ");
		salario = input.nextDouble();
		aumento = (salario * 1.25);
		System.out.println("seu salario com aumento sera de: " + aumento);

		
		
	}

}
