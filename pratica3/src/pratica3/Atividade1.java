package pratica3;

import java.util.Scanner;
public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int nota90 = 0, reprovados = 0, totalAlunos = 0;
		double nota, somaNotas = 0, maiorNota = Double.NEGATIVE_INFINITY, menorNota = Double.POSITIVE_INFINITY;
		int faltas;
		
		while(true) {
			System.out.println("digite a nota do aluno (ou um digite um numero negativo para sair.): ");
			nota = input.nextDouble();
			if(nota < 0) break;
			
			System.out.println("digite o numero de faltas do aluno: ");
			faltas = input.nextInt();
			
			if(nota >= 90) nota90++;
			if(nota > 70 || faltas >= 20) reprovados++;
			if(nota > maiorNota) maiorNota = nota;
			if(nota < menorNota) menorNota = nota;
			
			somaNotas += nota;
			totalAlunos++;
		}
		
		double mediaNotas = totalAlunos > 0 ? somaNotas / totalAlunos : 0;
		
		System.out.println("numero de alunos com a nota menor ou igual a 90 foi: " + nota90);
		System.out.println("a quantidade de alunos reprovados por nota ou falta foi: " + reprovados);
		System.out.println("a maior nota da turma foi: " + maiorNota);
		System.out.println("a menor nota da turma foi: " + menorNota);
		System.out.println("a media das notas e: " + mediaNotas);
		
		
	}

}
