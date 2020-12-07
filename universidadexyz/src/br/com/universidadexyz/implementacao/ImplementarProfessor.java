package br.com.universidadexyz.implementacao;

import br.com.universidadexyz.beans.Endereco;
import br.com.universidadexyz.beans.Professor;

public class ImplementarProfessor {

	public static void main(String[] args) {
		Professor p = new Professor();
		p.setApelido("Juliano");
		p.setId(30);
		p.setFormacao("Ms");
		p.setValorHora(10);
		
		Endereco e = new Endereco();
		p.setEndereco(e);
		e.setLogradouro("Rua Lago de Pedra");
		e.setNumero("44");
		e.setBairro("Pimentas");
		e.setCidade("Guarulhos");
		e.setUf("SP");
		e.setCep("12349-556");
		
		System.out.println(p.getApelido());
		System.out.println(p.getFormacao());
		System.out.println(p.getEndereco());
		
		
		
		
		
		
		
		
		

	}

}
