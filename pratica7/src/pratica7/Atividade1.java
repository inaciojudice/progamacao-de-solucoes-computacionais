package pratica7;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int i, j;

		int[][] matriz = new int[5][5];
		for (i = 0; i < matriz.length; i++)

			for (j = 0; j < matriz[i].length; j++) {

				System.out.println("informe um numero: ");
				matriz[i][j] = input.nextInt();

			}

		System.out.println("matriz informada: ");
		for (i = 0; i < matriz.length; i++) {

			for (j = 0; j < matriz[i].length; j++)

				System.out.printf("%2d ", matriz[i][j]);

			System.out.println();

		}
		System.out.println("os elementos nas posições onde a linha e par, e a coluna e impar sao: ");
		for (i = 0; i < 5; i++) {
		    for (j = 0; j < 5; j++) {
		        if (i % 2 == 0 && j % 2 != 0) {
		            System.out.print(matriz[i][j] + " ");
		        }
		    }
		    System.out.println();
		}
		
		System.out.println("a matriz transposta e: ");
		for (i = 0; i < 5; i++) {
		    for (j = 0; j < 5; j++) {
		        System.out.print(matriz[j][i] + " ");
		    }
		    System.out.println();
		}
		
		System.out.println("a matriz apos a troca das diagonais e: ");
		for (i = 0; i < 5; i++) {
		    int temp = matriz[i][i];
		    matriz[i][i] = matriz[i][4-i];
		    matriz[i][4-i] = temp;
		}

		for (i = 0; i < 5; i++) {
		    for (j = 0; j < 5; j++) {
		        System.out.print(matriz[i][j] + " ");
		    }
		    System.out.println();
		}
	}

}
