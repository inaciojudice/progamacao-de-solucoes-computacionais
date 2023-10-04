package atividadePratica1;

import javax.swing.JOptionPane;
public class Atividade2joptionpane {

	public static void main(String[] args) {

		String entrada;
		int nascimento, anoatual, idade, idadefutura;
		
		entrada = JOptionPane.showInputDialog("em que ano voce nasceu?");
		nascimento = Integer.parseInt(entrada);
		entrada = JOptionPane.showInputDialog("qual o ano atual? ");
		anoatual = Integer.parseInt(entrada);
		
		idade = (anoatual - nascimento);
		idadefutura = (2050 - nascimento);
		
		JOptionPane.showMessageDialog(null, "sua idade hoje e: " + idade + ", sua idade em 2050 sera: " + idadefutura);
		System.exit(0);

		
	}

}
