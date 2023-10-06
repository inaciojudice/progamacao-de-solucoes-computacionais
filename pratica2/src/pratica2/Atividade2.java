package pratica2;

import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double lado1, lado2, lado3;
		
		System.out.println("informe o valor do primeiro lado do triangulo: ");
		lado1 = input.nextDouble();
		System.out.println("informe o valor do segundo lado do triangulo: ");
		lado2 = input.nextDouble();
		System.out.println("informe o valor do terceiro lado do triangulo: ");
		lado3 = input.nextDouble();
		
		if(lado1 == lado2 && lado2 == lado3) System.out.println("o triangulo e um Equilatero! "); 
		else if(lado1 != lado2 && lado1 != lado3) System.out.println("o triangulo e um Escaleno! ");
		else {
			System.out.println("o triangulo e um Isosceles! ");
		}
	}

}
