package principal;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Fa�a um programa que entre com um n�mero qualquer e indique se ele � impar ou par

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um ano qualquer: ");
		int numero = sc.nextInt();
				
		if (numero % 2 == 0) {
			System.out.println("N�mero � par");
		} else {
			System.out.println("N�mero � impar");
		}
		
		sc.close();

	}

}
