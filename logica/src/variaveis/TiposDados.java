package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		System.out.println("Nome..: " + nome);
		System.out.println("Altura: " + altura);
		System.out.println("Peso..: " + peso);
		System.out.println("Idade.: " + idade);
		double imc = peso / (altura * altura);
		System.out.println("IMC...: " + imc);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
