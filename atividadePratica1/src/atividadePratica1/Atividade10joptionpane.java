package atividadePratica1;

import javax.swing.JOptionPane;
public class Atividade10joptionpane {

	public static void main(String[] args) {

		String entrada;
		double comprimento, area, volume, raio;
		entrada = JOptionPane.showInputDialog("digite o raio");
		raio = Double.parseDouble(entrada);

		comprimento = (Math.PI * 2 * raio);
		area = (Math.PI * (raio * 2 * 2));
		volume = (Math.PI * (3/4) * (raio * 2 * 2 * 2));
		
		JOptionPane.showMessageDialog(null, "o comprimento e de: " + comprimento);
		JOptionPane.showMessageDialog(null, "a area e de: " + area);
		JOptionPane.showMessageDialog(null, "o volume e de " + volume);
		
				
				
	}

}
