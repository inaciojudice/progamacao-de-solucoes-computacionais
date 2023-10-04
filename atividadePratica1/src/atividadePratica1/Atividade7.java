package atividadePratica1;

import java.util.Scanner;
public class Atividade7 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double salario, salario_minimo, salarios_recebidos;
		
		System.out.println("digite o salario minimo atual: "); 
		salario_minimo = input.nextDouble();
		System.out.println("digite seu salario atual: ");
		salario = input.nextDouble();
		
		salarios_recebidos = (salario / salario_minimo);
		
		System.out.println("voce recebe:" + salarios_recebidos + " salarios minimos.");
		
	}

}
