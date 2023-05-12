package principal;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		/*
		 * Faça um programa que pergunte quanto que você ganha por hora e o número de horas trabalhado no mês.
		 * Calcule e mestre o total do seu salário no referido mês
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quanto que você ganha por hora: ");
		double valorHora = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("Informe quantas horas vc trabalha por mês: ");
		int horaTrabalhadas = sc.nextInt();
		
		sc.close();
		
		System.out.println("Seu salário por mês é R$" + (valorHora * horaTrabalhadas));
	}
}
