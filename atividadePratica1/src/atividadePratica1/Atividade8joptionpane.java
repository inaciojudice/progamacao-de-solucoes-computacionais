package atividadePratica1;

import javax.swing.JOptionPane;
public class Atividade8joptionpane {

	public static void main(String[] args) {
		
		String entrada;
		double peso, segundo_peso, terceiro_peso;
		
		entrada = JOptionPane.showInputDialog("digite seu peso atual: ");
		peso = Double.parseDouble(entrada);
		segundo_peso = (peso * 1.15);
		terceiro_peso = (peso * 0.80);

		JOptionPane.showMessageDialog(null, "seu peso engordando 15% sera: " + segundo_peso + ", seu peso emagrecendo 20% sera: " + terceiro_peso);
		
	}

}
