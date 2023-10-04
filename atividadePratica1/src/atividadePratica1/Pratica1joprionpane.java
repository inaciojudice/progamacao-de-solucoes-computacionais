package atividadePratica1;

import javax.swing.JOptionPane;
public class Pratica1joprionpane {

	public static void main(String[] args) {
		
		String entrada;
		int numero1, numero2, numero3, media;
		
		entrada = JOptionPane.showInputDialog("digite o primeiro numero: ");
		numero1 = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("digite o segundo numero: ");
		numero2 = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog(entrada);
		numero3 = Integer.parseInt(entrada);
		
		media = (numero1 + numero2 + numero3) / 3;
		JOptionPane.showMessageDialog(null, "a media e: " + media);
		System.exit(0);
		

		
	}

}
