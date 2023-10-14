package pratica5;

import java.util.Scanner;
public class Atividade10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("digite a idade da pessoa " + (i+1) + ":");
            int idade = input.nextInt();

            System.out.println("digite o sexo da pessoa " + (i+1) + " (M para masculino, F para feminino):");
            char sexo = input.next().charAt(0);

            if (sexo == 'F' && idade >= 20 && idade <= 40) {
                count++;
            }
        }

        System.out.println("o numero de pessoas do sexo feminino entre 20 e 40 anos e: " + count);

        input.close();
	}

}
