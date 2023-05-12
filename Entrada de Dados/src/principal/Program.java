package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 
		 * */
		
		System.out.println("Entre com seu Sexo: ");
		char sexo = sc.next().charAt(0);
		
		System.out.println("Entre com a sua idade: ");
		int idade = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Entre com o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Entre com a sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.println("Meu nome é: "+ nome
				+ ", minha idade é " + idade
				+ ", meu sexo é: " + sexo
				+ ", minha altura é: "+ altura);
		
		
	}
	

}
