package principal;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Fa�a um programa que leia dois n�meros e imprima o maior deles

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero qualquer: ");
		int numero1 = sc.nextInt();
				
		System.out.println("Informe outro n�mero qualquer: ");
		int numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.println(numero1+" � maior que "+ numero2);
		} else if(numero2 > numero1){
			System.out.println(numero2+" � maior que "+ numero1);
		}else {
			System.out.println(numero1+" � igual a "+ numero2);
		}
		
		sc.close();

	}

}
