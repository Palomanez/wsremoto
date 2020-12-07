package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Produto").toUpperCase();
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Quantidade"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		if (qtde > 20) {
			System.out.println("Estoque Alto");
		}else if (qtde < 10){
			System.out.println("Seu estoque está abaixo");
		}else {
		System.out.println("Estoque normal");
		}if (valor > 1000) {
		System.out.println(valor + "Seu valor está muito alto");
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
