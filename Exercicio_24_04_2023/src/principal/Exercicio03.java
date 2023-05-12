package principal;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça dois números e imprima na tela
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int numero1 = sc.nextInt();
		sc.nextLine();

		System.out.println("Informe um número: ");
		int numero2 = sc.nextInt();
		sc.close();

		System.out.println("A soma de " + numero1 + " + " + numero2 + " é: " + (numero1 + numero2));
	}

}
