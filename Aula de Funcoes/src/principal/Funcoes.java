package principal;

public class Funcoes {
	public static void main(String[] args) {
		mensagem();

		String msg2 = mensagem2();
		System.out.println(msg2);

		System.out.println(mensagem3("Luan da Silva Rocha"));

	}

	//
	static void mensagem() {
		System.out.println("Minha primeira Fun��o");
	}

	static String mensagem2() {
		return "Minha segunda fun��o";
	}

	// fun��o que recebe a msg (String e retorna a String)
	static String mensagem3(String msg) {
		return "Meu nome passado pro paramentro �: " + msg;
	}

}
