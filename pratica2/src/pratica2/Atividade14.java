package pratica2;

import java.util.Scanner;
public class Atividade14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int entrada;
		
		System.out.println("informe o comando GIT: digite (1) para git clone, digite (2) para git fetch, digite (3) para git pull: ");
		entrada = input.nextInt();
		
		if(entrada == 1) {
			System.out.println("O comando 'git clone' e usado para criar uma copia local de um repositorio remoto.");
		}
		else if(entrada == 2) {
			System.out.println("O comando 'git fetch' e usado para baixar as referencias de branches e commits do repositorio remoto para seu repositorio local, permitindo que voce veja as alteracoes feitas por outros sem alterar o seu trabalho local. ");
		}
		else if(entrada == 3) {
			System.out.println("O comando 'git pull' e usado para buscar e baixar conteudo de um repositorio remoto e imediatamente atualizar o repositorio local para corresponder ao conteudo. ");
		}

	}

}
