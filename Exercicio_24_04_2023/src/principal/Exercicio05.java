package principal;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		/*
		 * Fa�a um programa que pergunte quanto que voc� ganha por hora e o n�mero de horas trabalhado no m�s.
		 * Calcule e mestre o total do seu sal�rio no referido m�s
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quanto que voc� ganha por hora: ");
		double valorHora = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("Informe quantas horas vc trabalha por m�s: ");
		int horaTrabalhadas = sc.nextInt();
		
		sc.close();
		
		System.out.println("Seu sal�rio por m�s � R$" + (valorHora * horaTrabalhadas));
	}
}
