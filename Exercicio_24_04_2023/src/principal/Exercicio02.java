package principal;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que pe�a um n�mero e ent�o moestre a mensagem
		 * "O n�mero informado foi [n�mero]" 
		 */
		 
		Scanner sc = new Scanner(System.in);

		sc.nextLine();
		System.out.println("Insira um n�mero: ");
		int numero = sc.nextInt();
		
		sc.close();

		System.out.println("O n�mero informado foi " + numero);
	}

}
