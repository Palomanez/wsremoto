package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/*for -> Pr�prio para quando n�o existe intera��o com o usu�rio final
		Sintaxe: 
		1� Definir o contador
		2� Qual a condi��o para manter a repeti��o 
		3� Qual a forma de contagem 

*/
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		for (int cont=0; cont<11;cont++) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
			
		}
		
		
		
		
		
		
		
		
	}

}
