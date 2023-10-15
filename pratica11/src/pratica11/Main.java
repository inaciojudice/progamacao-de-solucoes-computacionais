package pratica11;

import java.util.Scanner;

class Pessoa {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

class PessoaFisica extends Pessoa {
	private String cpf;

	public String getCPF() {
		return cpf;
	}

	public void setCPF(String cpf) {
		this.cpf = cpf;
	}
}

class PessoaJuridica extends Pessoa {
	private String cnpj;

	public String getCNPJ() {
		return cnpj;
	}

	public void setCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
}

class Cadastro {
	private Pessoa[] pessoas;
	private int tamanho;
	private int capacidade;

	public Cadastro(int capacidade) {
		this.capacidade = capacidade;
		this.tamanho = 0;
		this.pessoas = new Pessoa[capacidade];
	}

	public void cadastrarPessoa(Pessoa pessoa) {
		if (tamanho < capacidade) {
			pessoas[tamanho] = pessoa;
			tamanho++;
			System.out.println("Pessoa cadastrada com sucesso!");
		} else {
			System.out.println("Cadastro está cheio. Não é possível cadastrar mais pessoas.");
		}
	}

	public void imprimirCadastro() {
		System.out.println("Lista de Pessoas Cadastradas:");
		for (int i = 0; i < tamanho; i++) {
			System.out.println("Nome: " + pessoas[i].getNome());
			if (pessoas[i] instanceof PessoaFisica) {
				System.out.println("CPF: " + ((PessoaFisica) pessoas[i]).getCPF());
			} else if (pessoas[i] instanceof PessoaJuridica) {
				System.out.println("CNPJ: " + ((PessoaJuridica) pessoas[i]).getCNPJ());
			}
			System.out.println("---------------");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cadastro cadastro = new Cadastro(10);

		while (true) {
			System.out.println("Escolha o tipo de pessoa (1 - Pessoa Física, 2 - Pessoa Jurídica, 0 - Sair): ");
			int escolha = scanner.nextInt();
			scanner.nextLine(); // Limpar o buffer de entrada

			if (escolha == 0) {
				break;
			}

			System.out.print("Digite o nome: ");
			String nome = scanner.nextLine();

			if (escolha == 1) {
				PessoaFisica pessoaFisica = new PessoaFisica();
				pessoaFisica.setNome(nome);
				System.out.print("Digite o CPF: ");
				String cpf = scanner.nextLine();
				pessoaFisica.setCPF(cpf);
				cadastro.cadastrarPessoa(pessoaFisica);
			} else if (escolha == 2) {
				PessoaJuridica pessoaJuridica = new PessoaJuridica();
				pessoaJuridica.setNome(nome);
				System.out.print("Digite o CNPJ: ");
				String cnpj = scanner.nextLine();
				pessoaJuridica.setCNPJ(cnpj);
				cadastro.cadastrarPessoa(pessoaJuridica);
			}
		}

		cadastro.imprimirCadastro();
	}
}
	
	

