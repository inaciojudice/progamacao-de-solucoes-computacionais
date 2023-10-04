package atividadePratica1;

import javax.swing.JOptionPane;
public class Atividade9joptionpane {

	public static void main(String[] args) {

		String entrada;
		double a, b, c, d;
		
		entrada = JOptionPane.showInputDialog("digite o primeiro cateto: ");
		a = Double.parseDouble(entrada);
		entrada = JOptionPane.showInputDialog("digite o segundo cateto: ");
		b = Double.parseDouble(entrada);
		c = (b * 2 * 2) + (a * 2 * 2);
		d = Math. sqrt(c);
		
		JOptionPane.showMessageDialog(null, "o valor da hipotenusa e: " + d);
		
	}

}
