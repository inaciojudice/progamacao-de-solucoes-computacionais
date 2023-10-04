package atividadePratica1;

import javax.swing.JOptionPane;
public class Atividade4joptionpane {

	public static void main(String[] args) {

		String entrada;
		double salario, aumento;
		
		entrada = JOptionPane.showInputDialog("digite seu salario atual: ");
		salario = Double.parseDouble(entrada);
		aumento = (salario * 1.25);
		
		JOptionPane.showMessageDialog(null, "seu salario com aumento sera de: " + aumento);
		
		
		
	}

}
