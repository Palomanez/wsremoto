package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro"));
		char opcao = JOptionPane.showInputDialog
				("Digite:\n<+> Somar\n<-> Subtrair\n* Multiplicar\n/ Dividir").charAt(0);
		if (opcao=='+') {
			System.out.println("Total: " + (num1 + num2));
		}else if (opcao=='-') {
			System.out.println("Resultado: " + (num1 - num2));
		}else if (opcao=='*') {
			System.out.println("Resultado: " + (num1 * num2));
		}else if (opcao=='/') {
			if (num2!=0) {
				System.out.println("Resultado: " + (num1/num2));
			}
		}else {
			System.out.println("Opção Inválida");
		}

	}
}

	/*package decisao; Feito por mim 

import javax.swing.JOptionPane;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro"));
		String operador = JOptionPane.showInputDialog("Escolha a operação aritmética"); 
		float adicao = (num1 + num2);


				if  (operador == '+')
					System.out.println("Adição:" )(num1 + num2));

	}

}
	 */