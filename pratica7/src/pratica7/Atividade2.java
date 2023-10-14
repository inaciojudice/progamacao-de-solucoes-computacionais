package pratica7;

import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int i, j;
        int[][] matriz1 = new int[2][2];
        int[][] matriz2 = new int[2][2];
        int[][] matrizResultante = new int[2][2];

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.println("digite os numeros da primeira matriz: ");
                matriz1[i][j] = input.nextInt();
            }
        }

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.println("digite os numeros da segunda matriz: ");
                matriz2[i][j] = input.nextInt();
            }
        }

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                matrizResultante[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("a matriz resultante e: ");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                System.out.print(matrizResultante[i][j] + " ");
            }
            System.out.println();
        }
		
        input.close();
	}

}
