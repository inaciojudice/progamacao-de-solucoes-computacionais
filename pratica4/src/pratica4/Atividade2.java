package pratica4;

import java.util.Scanner;
public class Atividade2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double nota, salario = 0;
		int idade;
		String sexo;
		
		System.out.println("informe sua nota: ");
		nota = input.nextDouble();
		while(nota < 0 || nota > 10) {
			System.out.println("nota invalida. Informe novamente: ");
			nota = input.nextDouble();
		}
		System.out.println("nota valida!! ");
		
		System.out.println("infome um salario maior que zero: ");
		while(salario < 0) {
			System.out.println("salario invalido, informe novamente: ");
			salario = input.nextDouble();
		}
		System.out.println("salario valido!! ");
		
		System.out.println("informe seu sexo: (M) masculino ou (F) feminino: ");
		sexo = input.next();
		while(!sexo.equals("m") && !sexo.equals("f")) {
			System.out.println("sexo invalido, informe novamente: ");
			sexo = input.next();
		}
		System.out.println("sexo valido!! ");
		
		System.out.println("informe sua idade (entre 0 e 120): ");
		idade = input.nextInt();
		while(idade < 0 || idade > 120) {
			System.out.println("idade invalida, iforme a idade novamente: ");
			idade = input.nextInt();
		}
		System.out.println("idade valida!! ");

	}

}

