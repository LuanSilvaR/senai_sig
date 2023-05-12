package principal;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// Faça um programa que leia 3 números e imprima o maior deles

		//comando para importar a biblioteca Ctrol + 
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número qualquer: ");
		int numero1 = sc.nextInt();

		System.out.println("Informe outro número qualquer: ");
		int numero2 = sc.nextInt();

		System.out.println("Informe outro número qualquer: ");
		int numero3 = sc.nextInt();

		if ((numero1 == numero2 || numero1 == numero3) || (numero2 == numero1 || numero2 == numero3)
				|| (numero3 == numero1 || numero3 == numero2)) {
			System.out.println("Validação não pode ser realizada pois existem dois números que são iguais");
		} else {
			if (numero1 > numero2) {
				if (numero1 > numero3) {
					System.out.println(numero1 + " é o maoir número");
				}
			} else if (numero2 > numero1) {
				if (numero2 > numero3) {
					System.out.println(numero2 + " é o maoir número");
				}
			} else {
				System.out.println(numero3 + " é o maoir número");
			}
		}

		sc.close();

	}

}

