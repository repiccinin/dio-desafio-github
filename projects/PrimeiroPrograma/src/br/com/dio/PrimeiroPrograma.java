package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato();
		Livros livro = new Livros();
		System.out.println("Gato:"+gato);
		System.out.println("Livro:"+livro);
	}

}

class Livros{
	private String nome;
	private Integer npag;
}
