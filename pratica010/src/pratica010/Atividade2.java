package pratica010;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		/**
		 * Classe Pessoa representa uma pessoa com nome.
		 */
		class Pessoa {
			private String nome;

			/**
			 * Define o nome da pessoa.
			 * 
			 * @param nome O nome da pessoa.
			 */
			public void setNome(String nome) {
				this.nome = nome;
			}

			/**
			 * Obtém o nome da pessoa.
			 * 
			 * @return O nome da pessoa.
			 */
			public String getNome() {
				return nome;
			}
		}

		/**
		 * Classe PessoaFisica representa uma pessoa física com CPF.
		 */
		class PessoaFisica extends Pessoa {
			private String CPF;

			/**
			 * Define o CPF da pessoa física.
			 * 
			 * @param CPF O CPF da pessoa física.
			 */
			public void setCPF(String CPF) {
				this.CPF = CPF;
			}

			/**
			 * Obtém o CPF da pessoa física.
			 * 
			 * @return O CPF da pessoa física.
			 */
			public String getCPF() {
				return CPF;
			}
		}

		/**
		 * Classe PessoaJuridica representa uma pessoa jurídica com CNPJ.
		 */
		class PessoaJuridica extends Pessoa {
			private String CNPJ;

			/**
			 * Define o CNPJ da pessoa jurídica.
			 * 
			 * @param CNPJ O CNPJ da pessoa jurídica.
			 */
			public void setCNPJ(String CNPJ) {
				this.CNPJ = CNPJ;
			}

			/**
			 * Obtém o CNPJ da pessoa jurídica.
			 * 
			 * @return O CNPJ da pessoa jurídica.
			 */
			public String getCNPJ() {
				return CNPJ;
			}
		}

		/**
		 * Classe Cadastro permite cadastrar pessoas em um vetor.
		 */
		class Cadastro {
			private Pessoa[] cadastro;
			private int numPessoas;

			/**
			 * Inicializa o vetor de cadastro com um tamanho máximo.
			 * 
			 * @param tamanho O tamanho máximo do vetor de cadastro.
			 */
			public Cadastro(int tamanho) {
				cadastro = new Pessoa[tamanho];
				numPessoas = 0;
			}

			/**
			 * Adiciona uma pessoa ao vetor de cadastro.
			 * 
			 * @param pessoa A pessoa a ser cadastrada.
			 */
			public void cadastrarPessoa(Pessoa pessoa) {
				if (numPessoas < cadastro.length) {
					cadastro[numPessoas] = pessoa;
					numPessoas++;
				} else {
					System.out.println("O vetor de cadastro está cheio.");
				}
			}

			/**
			 * Imprime o vetor de cadastro.
			 */
			public void imprimirCadastro() {
				for (int i = 0; i < numPessoas; i++) {
					System.out.println("Nome: " + cadastro[i].getNome());
					if (cadastro[i] instanceof PessoaFisica) {
						System.out.println("CPF: " + ((PessoaFisica) cadastro[i]).getCPF());
					} else if (cadastro[i] instanceof PessoaJuridica) {
						System.out.println("CNPJ: " + ((PessoaJuridica) cadastro[i]).getCNPJ());
					}
					System.out.println();
				}
			}
		}

		class Main {
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);

				System.out.print("Informe o tamanho máximo do vetor de cadastro: ");
				int tamanhoCadastro = scanner.nextInt();
				Cadastro cadastro = new Cadastro(tamanhoCadastro);

				while (true) {
					System.out.println("Escolha o tipo de pessoa a ser cadastrada:");
					System.out.println("1. Pessoa Física");
					System.out.println("2. Pessoa Jurídica");
					System.out.println("3. Sair");

					int escolha = scanner.nextInt();
					scanner.nextLine(); // Consumir a quebra de linha

					if (escolha == 1) {
						PessoaFisica pessoaFisica = new PessoaFisica();
						System.out.print("Informe o nome: ");
						pessoaFisica.setNome(scanner.nextLine());
						System.out.print("Informe o CPF: ");
						pessoaFisica.setCPF(scanner.nextLine());
						cadastro.cadastrarPessoa(pessoaFisica);
					} else if (escolha == 2) {
						PessoaJuridica pessoaJuridica = new PessoaJuridica();
						System.out.print("Informe o nome: ");
						pessoaJuridica.setNome(scanner.nextLine());
						System.out.print("Informe o CNPJ: ");
						pessoaJuridica.setCNPJ(scanner.nextLine());
						cadastro.cadastrarPessoa(pessoaJuridica);
					} else if (escolha == 3) {
						break;
					} else {
						System.out.println("Opção inválida. Tente novamente.");
					}
				}

				System.out.println("Cadastro:");
				cadastro.imprimirCadastro();
			}
		}

	}

}
