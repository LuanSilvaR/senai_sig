package principal;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça um número e então moestre a mensagem
		 * "O número informado foi [número]" 
		 */
		 
		Scanner sc = new Scanner(System.in);

		sc.nextLine();
		System.out.println("Insira um número: ");
		int numero = sc.nextInt();
		
		sc.close();

		System.out.println("O número informado foi " + numero);
	}

}
