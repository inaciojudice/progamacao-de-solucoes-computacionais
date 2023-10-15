package pratica010;

public class Atividade3 {

	public static void main(String[] args) {

		class Tempo {
			private int hora;
			private int minuto;
			private int segundo;

			// Construtor sem parâmetros (0:0:0)
			public Tempo() {
				this(0, 0, 0);
			}

			// Construtor com hora e padrão minuto e segundo (hora:0:0)
			public Tempo(int hora) {
				this(hora, 0, 0);
			}

			// Construtor com hora e minuto, padrão segundo (hora:minuto:0)
			public Tempo(int hora, int minuto) {
				this(hora, minuto, 0);
			}

			// Construtor com hora, minuto e segundo (hora:minuto:segundo)
			public Tempo(int hora, int minuto, int segundo) {
				setTime(hora, minuto, segundo);
			}

			// Método para definir a hora, minuto e segundo
			public void setTime(int hora, int minuto, int segundo) {
				if (hora >= 0 && hora <= 23 && minuto >= 0 && minuto <= 59 && segundo >= 0 && segundo <= 59) {
					this.hora = hora;
					this.minuto = minuto;
					this.segundo = segundo;
				} else {
					throw new IllegalArgumentException("Valores de hora, minuto ou segundo inválidos.");
				}
			}

			// Métodos getters
			public int getHora() {
				return hora;
			}

			public int getMinuto() {
				return minuto;
			}

			public int getSegundo() {
				return segundo;
			}

			// Método que retorna a hora no formato h:m:s
			public String getTempoFormatado() {
				return String.format("%d:%02d:%02d", hora, minuto, segundo);
			}

			public static void main(String[] args) {
				// Exemplo de uso
				Tempo tempo1 = new Tempo(); // Tempo padrão (0:0:0)
				Tempo tempo2 = new Tempo(10); // 10:0:0
				Tempo tempo3 = new Tempo(8, 30); // 8:30:0
				Tempo tempo4 = new Tempo(14, 45, 30); // 14:45:30

				System.out.println("Tempo 1: " + tempo1.getTempoFormatado());
				System.out.println("Tempo 2: " + tempo2.getTempoFormatado());
				System.out.println("Tempo 3: " + tempo3.getTempoFormatado());
				System.out.println("Tempo 4: " + tempo4.getTempoFormatado());
			}
		}

	}

}
