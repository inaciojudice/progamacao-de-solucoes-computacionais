package atividadePratica1;

import javax.swing.JOptionPane;
public class Atividade3joptionpane {

	public static void main(String[] args) {
		
		String entrada;
		double cotacao = 4.86, valor_recebido, convertido;
		
		entrada = JOptionPane.showInputDialog("Informe o valor em dólares: ");
		valor_recebido = Double.parseDouble(entrada);
		
		convertido = valor_recebido * cotacao;
		
		JOptionPane.showMessageDialog(null, "o valor em reais e:  " + convertido);
		

		
	}

}
