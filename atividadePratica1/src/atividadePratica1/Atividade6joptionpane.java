package atividadePratica1;

import javax.swing.JOptionPane;
public class Atividade6joptionpane {

	public static void main(String[] args) {

		String entrada;
		double celsius, fahrenheit;
		
		entrada =  JOptionPane.showInputDialog("digite a temperatura em celssius para ser convertida em fahrenheit");
		celsius = Double.parseDouble(entrada);
		
		fahrenheit = (celsius * 1.8) + 32;
		
		JOptionPane.showMessageDialog(null, "a temperatura em fahrenheit fica: " + fahrenheit);
		
		
	}

}
