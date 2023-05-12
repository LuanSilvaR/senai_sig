package principal;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Faça um programa que entre com um número qualquer e indique se ele é impar ou par

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um ano qualquer: ");
		int numero = sc.nextInt();
				
		if (numero % 2 == 0) {
			System.out.println("Número é par");
		} else {
			System.out.println("Número é impar");
		}
		
		sc.close();

	}

}
