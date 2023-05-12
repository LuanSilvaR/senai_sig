package principal;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Faça um programa que peça para o usuário entrar com um ano e dizer se esse
		// ano e bissexto ou não

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um ano qualquer: ");
		int ano = sc.nextInt();
		int length = String.valueOf(ano).length();

		if (length == 4 && ano > 2023) {
			System.out.println("Informe um ano valido!");
		} else if (ano % 400 == 0 || ano % 4 == 0) {
			System.out.println("Ano " + ano + " é bissexto");
		} else {
			System.out.println("Ano " + ano + " não é bissexto");
		}
		
		sc.close();

	}

}
