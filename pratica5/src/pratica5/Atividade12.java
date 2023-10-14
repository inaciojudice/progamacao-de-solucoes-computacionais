package pratica5;

import java.util.Scanner;
public class Atividade12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.println("informe um numero:");
        int num = input.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
        input.close();
	}

}
