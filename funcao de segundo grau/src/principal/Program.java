package principal;

import java.util.Scanner;

import utilitie.Calculo;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Escreva o valor de A: ");
		int valorA = sc.nextInt();

		System.out.print("Escreva o valor de B: ");
		int valorB = sc.nextInt();
		
		System.out.print("Escreva o valor de C: ");
		int valorC = sc.nextInt();
		
		double delta = Calculo.delta(valorA,valorB,valorC); 

		System.out.println("valor de Delta " +  delta);
		
		
		sc.close();
	}

}
