package pratica09;

/**
 * A classe Retangulo representa um retângulo com altura e largura.
 */
public class Retangulo {
	private float altura, largura;

	/**
	 * Construtor padrão que inicializa a altura e largura como 0.
	 */
	public Retangulo() {
		altura = 0;
		largura = 0;
	}

	/**
	 * Obtém a altura do retângulo.
	 * 
	 * @return A altura do retângulo.
	 */
	public float getAltura() {
		return altura;
	}

	/**
	 * Define a altura do retângulo.
	 * 
	 * @param alt A altura a ser definida.
	 */
	public void setAltura(float alt) {
		altura = alt;
	}

	/**
	 * Obtém a largura do retângulo.
	 * 
	 * @return A largura do retângulo.
	 */
	public float getLargura() {
		return largura;
	}

	/**
	 * Define a largura do retângulo.
	 * 
	 * @param larg A largura a ser definida.
	 */
	public void setLargura(float larg) {
		largura = larg;
	}

	/**
	 * Calcula a área do retângulo.
	 * 
	 * @return A área do retângulo.
	 */
	public float calculaArea() {
		return altura * largura;
	}

	/**
	 * Calcula o perímetro do retângulo.
	 * 
	 * @return O perímetro do retângulo.
	 */
	public float calculaPerimetro() {
		return 2 * altura + 2 * largura;
	}

	/**
	 * Exibe as informações do retângulo, incluindo altura, largura, área e
	 * perímetro.
	 */
	public void exibe() {
		System.out.println("Altura: " + String.format("%.2f", altura));
		System.out.println("Largura: " + String.format("%.2f", largura));
		System.out.println("Área: " + String.format("%.2f", calculaArea()));
		System.out.println("Perímetro: " + String.format("%.2f", calculaPerimetro()));
	}
}
