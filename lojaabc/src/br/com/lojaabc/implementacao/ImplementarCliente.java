package br.com.lojaabc.implementacao;

import br.com.lojaabc.beans.PessoaFisica;
import br.com.lojaabc.beans.PessoalJuridica;
import br.com.lojaabc.util.Magic;

public class ImplementarCliente {

	public static void main(String[] args) {
		char opcao = Magic.s("Digite F para pessoa Física").charAt(0);
		if  (opcao=='F') {
			PessoaFisica cliente = new PessoaFisica();
			cliente.setNome(Magic.s("Nome"));
			cliente.setCpf(Magic.s("CPF"));
			cliente.setEmail(Magic.s("Email").toLowerCase());
			cliente.setEspecial(Magic.b("Cliente Especial"));
			cliente.setId(Magic.i("Código"));
			cliente.setNascimento(Magic.s("Nascimento"));
			cliente.setRg(Magic.s("RG"));
			System.out.println(cliente.toString());
		}else {
			PessoalJuridica cliente = new PessoalJuridica();
			cliente.setNome(Magic.s("Nome"));
			cliente.setEmail(Magic.s("Email").toLowerCase());
			cliente.setEspecial(Magic.b("Cliente Especial?"));
			cliente.setId(Magic.i("Código"));
			cliente.setCnpj(Magic.s("CNPJ"));
			cliente.setContato(Magic.s("Contato"));
			System.out.println(cliente.toString());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
