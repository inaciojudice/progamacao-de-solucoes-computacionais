package atividadePratica1;

import javax.swing.JOptionPane;
public class Atividade5joptionpane {

	public static void main(String[] args) {

		String entrada;
		double diagonal_maior, diagonal_menor, area;
		
		entrada = JOptionPane.showInputDialog("informe a diagonal maior do losango: ");
		diagonal_maior = Double.parseDouble(entrada);
		entrada = JOptionPane.showInputDialog("informe a diagonal menor do losango: ");
		diagonal_menor = Double.parseDouble(entrada);
		
		area = (diagonal_maior * diagonal_menor) / 2;
		
		JOptionPane.showMessageDialog(null, "a area desse losango e: " + area);
		

		
	}

}
