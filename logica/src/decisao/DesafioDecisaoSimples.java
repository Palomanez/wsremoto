package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome: ").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		if (idade>70) {
			System.out.println(nome + "Seu voto � Facultativo!");
			
	}
		if (idade==16 || idade==17) {
			
		System.out.println(nome + "Seu voto � facultativo!");
			
		}
		
		if (idade>=18 && idade<=70) {
			System.out.println(nome + "Seu voto � obrigat�rio!");
			
		}
		
		if (idade<16) {
			
			System.out.println(nome + "Voc� n�o pode votar ainda!");
		}

	
	
	
	
	
	}





}
