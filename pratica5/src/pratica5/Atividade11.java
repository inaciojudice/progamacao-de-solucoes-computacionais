package pratica5;

import java.util.Scanner;
public class Atividade11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int countMasculino = 0;
        int countFeminino = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("digite o sexo da pessoa (M para masculino, F para feminino): ");
            String genero = input.next().toUpperCase();

            System.out.println("digite o peso da pessoa (em kg): ");
            double peso = input.nextDouble();

            if (genero.equals("M") && peso >= 60 && peso <= 80) {
                countMasculino++;
            } else if (genero.equals("F") && peso >= 50 && peso <= 70) {
                countFeminino++;
            }
        }

        System.out.println("quantidade de homens com peso entre 60 e 80 kg: " + countMasculino);
        System.out.println("quantidade de mulheres com peso entre 50 e 70 kg: " + countFeminino);
		
		input.close();
	}

}
