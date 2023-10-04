package atividadePratica1;

import javax.swing.JOptionPane;
public class Atividade7joptionpane {

	public static void main(String[] args) {

		String entrada;
		double salario, salario_minimo, salarios_recebidos;
		
		entrada = JOptionPane.showInputDialog("digite o salario minimo atual: ");
		salario_minimo = Double.parseDouble(entrada);
		entrada = JOptionPane.showInputDialog("digite seu salario atual: ");
		salario = Double.parseDouble(entrada);
		
		salarios_recebidos = (salario / salario_minimo);
		
		JOptionPane.showMessageDialog(null, "voce recebe:" + salarios_recebidos + " salarios minimos.");
		
	}

}
  