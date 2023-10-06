package pratica3;

import java.util.Scanner;
public class Atividade4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        double totalSalario = 0;
        int totalFilhos = 0;
        int contador = 0;
        double salario;
        int numFilhos;

        while (true) {
            System.out.println("informe o seu salario atual: ");
            salario = input.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.println("informe o nunmero de filhos: ");
            numFilhos = input.nextInt();

            totalSalario += salario;
            totalFilhos += numFilhos;
            contador++;
        }

        double mediaSalario = totalSalario / contador;
        double mediaFilhos = (double) totalFilhos / contador;

        System.out.println("a media salarial e: " + mediaSalario);
        System.out.println("a media de filhos e: " + mediaFilhos);
		
		
		
	}

}
