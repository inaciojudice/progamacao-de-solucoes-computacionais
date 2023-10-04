package atividadePratica1;

import javax.swing.JOptionPane;

public class Atividade11joptionpane {

	public static void main(String[] args) {

		   String numeroStr = JOptionPane.showInputDialog("Informe um número:");
	        
	        int numero = Integer.parseInt(numeroStr);
	        
	        StringBuilder resultado = new StringBuilder();
	        resultado.append("Tabuada de multiplicação para ").append(numero).append(":\n");

	        for (int i = 0; i <= 10; i++) {
	            int produto = numero * i;
	            resultado.append(numero).append(" x ").append(i).append(" = ").append(produto).append("\n");
	        }
	        
	        JOptionPane.showMessageDialog(null, resultado.toString());
		
		
	}

}
