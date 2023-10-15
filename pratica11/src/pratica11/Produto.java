package pratica11;

import java.util.Scanner;

public class Produto {
	private int id;
	private String nome;
	private double preco;
	private static int ultimo_id = 0;

	public Produto() {
		id = ++ultimo_id;
		nome = "Nome não informado";
		preco = 0;
	}

	public Produto(String nome, double preco) {
		this();
		this.nome = nome;
		setPreco(preco);
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			this.preco = 0;
		} else {
			this.preco = preco;
		}
	}

	public void exibe() {
		System.out.println("Produto: " + nome);
		System.out.println("Id: " + id);
		System.out.println("Nome: " + nome);
	}

	public void reajustaPreco(double percentual) {
		preco += (preco * percentual / 100);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o nome do primeiro produto: ");
		String nome1 = scanner.nextLine();
		System.out.print("Informe o preço do primeiro produto: ");
		double preco1 = scanner.nextDouble();

		Produto produto1 = new Produto(nome1, preco1);

		scanner.nextLine(); // Limpa o buffer do teclado

		System.out.print("Informe o nome do segundo produto: ");
		String nome2 = scanner.nextLine();
		System.out.print("Informe o preço do segundo produto: ");
		double preco2 = scanner.nextDouble();

		Produto produto2 = new Produto(nome2, preco2);

		System.out.print("Informe o percentual de reajuste: ");
		double percentual = scanner.nextDouble();

		produto1.reajustaPreco(percentual);
		produto2.reajustaPreco(percentual);

		System.out.println("\nInformações do primeiro produto:");
		produto1.exibe();

		System.out.println("\nInformações do segundo produto:");
		produto2.exibe();

		System.out.println("\nÚltimo ID gerado: " + Produto.ultimo_id);

		scanner.close();
	}
}
	

