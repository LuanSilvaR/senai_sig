package principal;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que pe�a 4 notas bimestrais e mostre a  m�dia
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a nota do primeiro semestre: ");
		double nota1 = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("Informe a nota do segundo semestre: ");
		double nota2 = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("Informe a nota do terceiro semestre: ");
		double nota3 = sc.nextDouble();
		
		sc.nextLine();
		System.out.println("Informe a nota do quarto semestre: ");
		double nota4 = sc.nextDouble();
		
		sc.close();
		
		System.out.println("A nota m�dia do aluno foi " + ((nota1+nota2+nota3+nota4)/4));
	}

}
