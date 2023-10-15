package pratica09;

/**
 * Classe Funcionario representa um funcionário com nome, idade, cargo, salário,
 * telefone e endereço.
 */
class Funcionario {
	private String nome;
	private int idade;
	private String cargo;
	private double salario;
	private String telefone;
	private String endereco;

	public Funcionario(String nome, int idade, String cargo, double salario, String telefone, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	/**
	 * Método para exibir os dados de um funcionário.
	 */
	public void exibe() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: " + salario);
		System.out.println("Telefone: " + telefone);
		System.out.println("Endereço: " + endereco);
	}
}

/**
 * Classe Cadastro permite cadastrar funcionários em um vetor e imprimir o vetor
 * de cadastro.
 */
class Cadastro {
	private Funcionario[] funcionarios;
	private int tamanho;

	public Cadastro(int capacidade) {
		funcionarios = new Funcionario[capacidade];
		tamanho = 0;
	}

	/**
	 * Método para cadastrar um funcionário no vetor de cadastro.
	 * 
	 * @param funcionario O funcionário a ser cadastrado.
	 */
	public void cadastrarFuncionario(Funcionario funcionario) {
		if (tamanho < funcionarios.length) {
			funcionarios[tamanho] = funcionario;
			tamanho++;
		} else {
			System.out.println("O vetor de cadastro está cheio. Não é possível cadastrar mais funcionários.");
		}
	}

	/**
	 * Método para imprimir o vetor de cadastro.
	 */
	public void imprimirCadastro() {
		for (int i = 0; i < tamanho; i++) {
			funcionarios[i].exibe();
			System.out.println("-------------------------");
		}
	}
}

/**
 * Classe Main (Principal) inicia o algoritmo, instanciando o objeto da classe
 * Cadastro.
 */
public class ADS {
	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro(10);

		// Cadastrar funcionários
		Funcionario funcionario1 = new Funcionario("João", 30, "Gerente", 5000.0, "123-456-7890", "Rua A");
		Funcionario funcionario2 = new Funcionario("Maria", 25, "Analista", 4000.0, "987-654-3210", "Rua B");

		cadastro.cadastrarFuncionario(funcionario1);
		cadastro.cadastrarFuncionario(funcionario2);

		// Imprimir o vetor de cadastro
		cadastro.imprimirCadastro();
	}
}

