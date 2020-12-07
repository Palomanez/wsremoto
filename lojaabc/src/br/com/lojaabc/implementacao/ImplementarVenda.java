package br.com.lojaabc.implementacao;

import br.com.lojaabc.beans.Cliente;
import br.com.lojaabc.beans.Fabricante;
import br.com.lojaabc.beans.Produto;
import br.com.lojaabc.beans.Venda;
import br.com.lojaabc.util.Magic;

public class ImplementarVenda {

	public static void main(String[] args) {
		Venda venda = new Venda(
				Magic.i("Nota fiscal"),
				new Produto(
						Magic.i("Código"),
						Magic.s("Descrição"),
						Magic.f("Valor Compra"),
						Magic.f("Valor Venda"),
						Magic.i("Qtde"),
						new Fabricante(
								Magic.s("CNPJ"),
								Magic.s("Razao Social"),
								Magic.s("Fone")
								)
						),
				new Cliente(
					Magic.i("Código do Cliente"),
					Magic.s("Nome do Cliente"),
					Magic.s("Email"),
					Magic.b("É especial?")
					),
				Magic.i("Qtde"),
				Magic.f("Total")
				
				);
				System.out.println(venda.toString());

	}

}

/*Venda venda = new Venda();
 * venda.setQtde(10);
 * venda.getProduto().setValorVenda(1500);
 * venda.getProduto().getFabricante().setCNPJ("1322131322");
 * sysout.println(venda.getProduto().getFabricante().getCNPJ());
 * 
 * Cliente cli = new Cliente();
 * cli.setEmail("cliente@cliente");
 * venda.setCliente(cli);
 * 
 * 
 * 
 * 
 * */
