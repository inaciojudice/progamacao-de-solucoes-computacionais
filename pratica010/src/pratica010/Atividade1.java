package pratica010;

public class Atividade1 {

	public static void main(String[] args) {

		/**
		 * A classe Veiculo representa um veículo com as propriedades marca, modelo,
		 * número do chassi, placa e cor.
		 */
		class Veiculo {
			private String marca;
			private String modelo;
			private String numeroChassi;
			private String placa;
			private String cor;

			/**
			 * Construtor da classe Veiculo.
			 */
			public Veiculo(String marca, String modelo, String numeroChassi, String placa, String cor) {
				this.marca = marca;
				this.modelo = modelo;
				this.numeroChassi = numeroChassi;
				this.placa = placa;
				this.cor = cor;
			}

			// Métodos de acesso (getters e setters)
			public String getMarca() {
				return marca;
			}

			public void setMarca(String marca) {
				this.marca = marca;
			}

			public String getModelo() {
				return modelo;
			}

			public void setModelo(String modelo) {
				this.modelo = modelo;
			}

			public String getNumeroChassi() {
				return numeroChassi;
			}

			public void setNumeroChassi(String numeroChassi) {
				this.numeroChassi = numeroChassi;
			}

			public String getPlaca() {
				return placa;
			}

			public void setPlaca(String placa) {
				this.placa = placa;
			}

			public String getCor() {
				return cor;
			}

			public void setCor(String cor) {
				this.cor = cor;
			}
		}

		/**
		 * A classe Cadastro permite ao usuário cadastrar veículos em um vetor e
		 * imprimir o vetor de cadastro.
		 */
		class Cadastro {
			private Veiculo[] veiculos;
			private int quantidadeVeiculosCadastrados;

			/**
			 * Construtor da classe Cadastro. Inicializa o vetor de veículos.
			 * 
			 * @param tamanhoVetor Tamanho máximo do vetor de cadastro.
			 */
			public Cadastro(int tamanhoVetor) {
				veiculos = new Veiculo[tamanhoVetor];
				quantidadeVeiculosCadastrados = 0;
			}

			/**
			 * Método para cadastrar um novo veículo no vetor.
			 * 
			 * @param veiculo O veículo a ser cadastrado.
			 */
			public void cadastrarVeiculo(Veiculo veiculo) {
				if (quantidadeVeiculosCadastrados < veiculos.length) {
					veiculos[quantidadeVeiculosCadastrados] = veiculo;
					quantidadeVeiculosCadastrados++;
				} else {
					System.out.println("O vetor de cadastro está cheio. Não é possível cadastrar mais veículos.");
				}
			}

			/**
			 * Método para imprimir o vetor de cadastro.
			 */
			public void imprimirCadastro() {
				System.out.println("Veículos cadastrados:");
				for (int i = 0; i < quantidadeVeiculosCadastrados; i++) {
					System.out.println("Veículo " + (i + 1) + ":");
					System.out.println("Marca: " + veiculos[i].getMarca());
					System.out.println("Modelo: " + veiculos[i].getModelo());
					System.out.println("Número do Chassi: " + veiculos[i].getNumeroChassi());
					System.out.println("Placa: " + veiculos[i].getPlaca());
					System.out.println("Cor: " + veiculos[i].getCor());
					System.out.println();
				}
			}
		}

		class Main {
			public static void main(String[] args) {
				Cadastro cadastro = new Cadastro(5); // Tamanho máximo do vetor de cadastro

				// Exemplo de cadastro de veículos
				cadastro.cadastrarVeiculo(new Veiculo("Marca1", "Modelo1", "Chassi1", "Placa1", "Cor1"));
				cadastro.cadastrarVeiculo(new Veiculo("Marca2", "Modelo2", "Chassi2", "Placa2", "Cor2"));
				cadastro.cadastrarVeiculo(new Veiculo("Marca3", "Modelo3", "Chassi3", "Placa3", "Cor3"));

				// Imprimir o vetor de cadastro
				cadastro.imprimirCadastro();
			}
		}

	}

}
