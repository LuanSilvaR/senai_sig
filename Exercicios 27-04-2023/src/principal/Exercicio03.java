package principal;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Faça um programa que leia dois números e imprima o maior deles

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número qualquer: ");
		int numero1 = sc.nextInt();
				
		System.out.println("Informe outro número qualquer: ");
		int numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.println(numero1+" é maior que "+ numero2);
		} else if(numero2 > numero1){
			System.out.println(numero2+" é maior que "+ numero1);
		}else {
			System.out.println(numero1+" é igual a "+ numero2);
		}
		
		sc.close();

	}

}
