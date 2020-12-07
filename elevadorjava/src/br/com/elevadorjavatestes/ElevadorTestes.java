package br.com.elevadorjavatestes;

import br.com.elevadorjava.ElevadorJava;

public class ElevadorTestes {
	public static void main (String[]args) {
		ElevadorJava elevador = new ElevadorJava();
		
		elevador.definirValores("Torre B, ", 
			(short) 10,
			(short) -1, 
			(byte) 5
			);
		
		System.out.println(elevador.exibirDados());
		elevador.entrar((byte)3);
		elevador.subir();
		elevador.subir();
		System.out.println(elevador.exibirDados());
		elevador.entrar((byte)5);
		elevador.subir((byte)20);
		elevador.subir();
		System.out.println(elevador.exibirDados());
		elevador.sair((byte)2);
		System.out.println(elevador.exibirDados());
		
		
		
		
		
		
		
		
		
		
	
	
	
	
}
}
