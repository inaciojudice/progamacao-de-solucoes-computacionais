package pratica010;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		class Circulo {
			private int x;
			private int y;
			private double raio;

			public Circulo(int x, int y, double raio) {
				this.x = x;
				this.y = y;
				this.raio = raio;
			}

			public Circulo() {
				this(0, 0, 0);
			}

			public void moveX(int x1) {
				x += x1;
			}

			public void moveY(int y1) {
				y += y1;
			}

			public void aumenta(double n) {
				raio *= n;
			}

			public double calcularArea() {
				return Math.PI * Math.pow(raio, 2);
			}

			public double calcularPerimetro() {
				return 2 * Math.PI * raio;
			}

			public void exibe() {
				System.out.println("Centro: (" + x + ", " + y + ")");
				System.out.println("Raio: " + raio);
				System.out.println("Área: " + calcularArea());
				System.out.println("Perímetro: " + calcularPerimetro());
			}
		}

		class Main {
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				int x, y;
				double raio;

				System.out.println("Informe as coordenadas e o raio do círculo:");
				System.out.print("Coordenada X: ");
				x = scanner.nextInt();
				System.out.print("Coordenada Y: ");
				y = scanner.nextInt();
				System.out.print("Raio: ");
				raio = scanner.nextDouble();

				Circulo circulo = new Circulo(x, y, raio);

				int escolha;
				do {
					System.out.println("\nMenu:");
					System.out.println("1 - Mover");
					System.out.println("2 - Aumentar");
					System.out.println("3 - Imprimir");
					System.out.println("4 - Sair");
					System.out.print("Escolha uma opção: ");
					escolha = scanner.nextInt();

					switch (escolha) {
					case 1:
						System.out.print("Digite a quantidade para mover no eixo X: ");
						int deltaX = scanner.nextInt();
						System.out.print("Digite a quantidade para mover no eixo Y: ");
						int deltaY = scanner.nextInt();
						circulo.moveX(deltaX);
						circulo.moveY(deltaY);
						break;
					case 2:
						System.out.print("Digite o fator de aumento do raio: ");
						double fator = scanner.nextDouble();
						circulo.aumenta(fator);
						break;
					case 3:
						circulo.exibe();
						break;
					case 4:
						System.out.println("Saindo do programa.");
						break;
					default:
						System.out.println("Opção inválida. Tente novamente.");
						break;
					}
				} while (escolha != 4);

				scanner.close();
			}
		}

	}

}
