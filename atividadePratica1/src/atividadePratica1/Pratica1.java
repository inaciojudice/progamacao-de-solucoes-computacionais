package atividadePratica1;

import java.util.Scanner;
public class Pratica1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        int numero1, numero2, numero3, media;

        System.out.print("Informe um número: ");
        numero1 = input.nextInt();

        System.out.print("Informe o segundo número número: ");
        numero2 = input.nextInt();

        System.out.print("Informe o terceito número número: ");
        numero3 = input.nextInt();

        media = numero1 + numero2 + numero3 / 3;

        System.out.println("A média é de" + media );
		
		
		
	
	}

}
