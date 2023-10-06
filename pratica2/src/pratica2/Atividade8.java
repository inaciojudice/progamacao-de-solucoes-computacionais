package pratica2;

import java.util.Scanner;
public class Atividade8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int entrada;
		
		System.out.println("informe o codigo do produro (1, 2, 3, 4, 5) para receber informacoes sobre o mesmo. ");
		entrada = input.nextInt();
		
		if(entrada == 1) {
			System.out.println("Codigo(1), Produto(Spato), Preco(R$ 99,99). ");
		}
		else if(entrada == 2) {
			System.out.println("Codigo(2), Produto(Bolsa), Preco(R$ 103,89). ");
		}
		else if(entrada == 3) {
			System.out.println("Codigo(3), Produto(Camisa), Preco(R$ 49,98). ");
		}
		else if(entrada == 4) {
			System.out.println("Codigo(4), Produto(Calca), Preco(R$ 89,72). ");
		}
		else if(entrada == 5) {
			System.out.println("Codigo(5), Produto(Blusa), Preco(R$ 97,35). ");
		}
		else {
			System.out.println("Codigo invalido, por favor informe o codigo novamente. ");
		}
		
		
	}

}
