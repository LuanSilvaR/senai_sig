package principal;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a letra correspondente ao seu sexo: ");
		char sexo = sc.next().charAt(0);
		
				
		if (Character.toUpperCase(sexo) == 'M') {
			System.out.println("Sexo Masculino");
		}else if (Character.toUpperCase(sexo) == 'F') {
			System.out.println("Sexo Feminino");
		} else {
			System.out.println("Valor informado não é invalido");
		}
		
		sc.close();

	}

}

