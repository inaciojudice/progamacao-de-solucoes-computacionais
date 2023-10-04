package atividadePratica1;
import java.util.Scanner;
public class Atividade5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double diagonal_maior, diagonal_menor, area;
		
		System.out.println("informe a diagonal maior do losango: ");
		diagonal_maior = input.nextDouble();
		System.out.println("informe a diagonal menor do losango: ");
		diagonal_menor = input.nextDouble();
		
		area = (diagonal_maior * diagonal_menor) / 2;
		
		System.out.println("a area desse losango e: " + area);
		
		
		
	}

}
