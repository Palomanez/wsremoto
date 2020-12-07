package repeticao;

public class ExemploDoInternet {

	public static void main(String[] args) {
		int x = 15;
		do {
			
			System.out.println("Você não tem permissão para entrar");
			x++;
		}while (x < 18);
	}

}
