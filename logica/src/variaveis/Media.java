package variaveis;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {
		String Disciplina = JOptionPane.showInputDialog("Disciplina");
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		double media = (nota1+nota2)/2;
		System.out.println("Disciplina: " + Disciplina + "\n" + "M�dia; " + media);
			}

}

