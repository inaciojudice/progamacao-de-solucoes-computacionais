package atividadePratica1;

import java.util.Scanner;
	
public class Atividade3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

        double cotacao = 4.86, valor_recebido, convertido;

        System.out.print("Informe o valor em dólares ");
        valor_recebido = input.nextInt();

        convertido = valor_recebido * cotacao;



        System.out.print("O valor em reais é: " + convertido);
		
	}

}
