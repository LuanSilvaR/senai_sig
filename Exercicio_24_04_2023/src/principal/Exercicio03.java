package principal;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que pe�a dois n�meros e imprima na tela
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero: ");
		int numero1 = sc.nextInt();
		sc.nextLine();

		System.out.println("Informe um n�mero: ");
		int numero2 = sc.nextInt();
		sc.close();

		System.out.println("A soma de " + numero1 + " + " + numero2 + " �: " + (numero1 + numero2));
	}

}
