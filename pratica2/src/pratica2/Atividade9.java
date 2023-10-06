package pratica2;

import java.util.Scanner;
public class Atividade9 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int planeta;
		double velocidade0, instante, altura, velocidadeT;
		
		System.out.println("escolha um planeta do sistema solar para realizar o experimento, digite: (1)Mercurio, (2)Venus, (3)Terra, (4)Marte, (5)Jupter, (6)Saturno, (7)Urano, (8)Netuno, (9)Plutao:  ");
		planeta = input.nextInt();
		System.out.println("informe a valocidade (V0) da bola (m/s): ");
		velocidade0 = input.nextDouble();
		System.out.println("informe o instante (segundos): ");
		instante  = input.nextDouble();
		
		if(planeta == 1) {
			velocidadeT = velocidade0 - 3.7 * instante;
			altura = velocidade0 * instante - (3.7 * Math.pow(instante, 2) / 2);
			System.out.println("No planeta Mercurio a velocidade v(t) da bola sera: " + velocidadeT + ", e a altura h(t) sera: " + altura);
		}
		else if(planeta == 2) {
			velocidadeT = velocidade0 - 8.8 * instante;
			altura = velocidade0 * instante - (8.8 * Math.pow(instante, 2) / 2);
			System.out.println("No planeta Venus a velocidade v(t) da bola sera: " + velocidadeT + ", e a altura h(t) sera: " + altura);
		}
		else if(planeta == 3) {
			velocidadeT = velocidade0 - 9.8 * instante;
			altura = velocidade0 * instante - (9.8 * Math.pow(instante, 2) / 2);
			System.out.println("No planeta Terra a velocidade v(t) da bola sera: " + velocidadeT + ", e a altura h(t) sera: " + altura);
		}
		else if(planeta == 4) {
			velocidadeT = velocidade0 - 3.8 * instante;
			altura = velocidade0 * instante - (3.8 * Math.pow(instante, 2) / 2);
			System.out.println("No planeta Marte a velocidade v(t) da bola sera: " + velocidadeT + ", e a altura h(t) sera: " + altura);
		}
		else if(planeta == 5) {
			velocidadeT = velocidade0 - 26.4 * instante;
			altura = velocidade0 * instante - (26.4 * Math.pow(instante, 2) / 2);
			System.out.println("No planeta Jupter a velocidade v(t) da bola sera: " + velocidadeT + ", e a altura h(t) sera: " + altura);
		}
		else if(planeta == 6) {
			velocidadeT = velocidade0 - 11.5 * instante;
			altura = velocidade0 * instante - (11.5 * Math.pow(instante, 2) / 2);
			System.out.println("No planeta Saturno a velocidade v(t) da bola sera: " + velocidadeT + ", e a altura h(t) sera: " + altura);
		}
		else if(planeta == 7) {
			velocidadeT = velocidade0 - 9.3 * instante;
			altura = velocidade0 * instante - (9.3 * Math.pow(instante, 2) / 2);
			System.out.println("No planeta Urano a velocidade v(t) da bola sera: " + velocidadeT + ", e a altura h(t) sera: " + altura);
		}
		else if(planeta == 8) {
			velocidadeT = velocidade0 - 12.2 * instante;
			altura = velocidade0 * instante - (12.2 * Math.pow(instante, 2) / 2);
			System.out.println("No planeta Netuno a velocidade v(t) da bola sera: " + velocidadeT + ", e a altura h(t) sera: " + altura);
		}
		else if(planeta == 9) {
			velocidadeT = velocidade0 - 0.6 * instante;
			altura = velocidade0 * instante - (0.6 * Math.pow(instante, 2) / 2);
			System.out.println("No planeta Plutao a velocidade v(t) da bola sera: " + velocidadeT + ", e a altura h(t) sera: " + altura);
		}
		else {
			System.out.println("numero do planeta informado invalido! ");
		}
	
	}

}
