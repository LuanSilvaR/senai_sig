package principal;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Fa�a um programa que leia 3 n�meros e imprima o maior deles

		//comando para importar a biblioteca Ctrol + 
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero qualquer: ");
		int numero1 = sc.nextInt();

		System.out.println("Informe outro n�mero qualquer: ");
		int numero2 = sc.nextInt();

		System.out.println("Informe outro n�mero qualquer: ");
		int numero3 = sc.nextInt();

		if ((numero1 == numero2 || numero1 == numero3) || (numero2 == numero1 || numero2 == numero3)
				|| (numero3 == numero1 || numero3 == numero2)) {
			System.out.println("Valida��o n�o pode ser realizada pois existem dois n�meros que s�o iguais");
		} else {
			if (numero1 > numero2) {
				if (numero1 > numero3) {
					System.out.println(numero1 + " � o maoir n�mero");
				}
			} else if (numero2 > numero1) {
				if (numero2 > numero3) {
					System.out.println(numero2 + " � o maoir n�mero");
				}
			} else {
				System.out.println(numero3 + " � o maoir n�mero");
			}
		}

		sc.close();

	}

}

