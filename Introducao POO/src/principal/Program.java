package principal;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		// Instanciando a classe pessoa
		// Control + Shif + O (comando )
		
		
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.nome = "Luan";
		pessoa.retornaIdade(1990);
		pessoa.cpf = "01801083100";
		pessoa.sexo = 'M';
		
		System.out.println(pessoa.nome + " " + pessoa.idade);

	}

}
