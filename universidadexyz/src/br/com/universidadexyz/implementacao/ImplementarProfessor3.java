package br.com.universidadexyz.implementacao;

import br.com.universidadexyz.beans.Endereco;
import br.com.universidadexyz.beans.Professor;

public class ImplementarProfessor3 {

	public static void main(String[] args) {
		Professor p = new Professor(
				1, 
				"JP",
				"Ms",
				10,
				new Endereco(
						"Rua X", 
						"44",
						"Complemento",
						"Pimentas",
						"OZ",
						"SP",
						"123456"

						)
				);
		System.out.println(p.toString());
	}

}
