package principal;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		
		/*
		 * Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus celsius
		 * C = 5 * ((F-32)/9))
		 * */
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a tempera em Fahrenheit: ");
		double temperaturaFahrenheit = sc.nextDouble();
		
		sc.close();
		
		double temperaturaCelsius = (5*((temperaturaFahrenheit-32)/9));
		
		System.out.println("A temperatura "+ temperaturaFahrenheit +" convertida em graus celsius é " +temperaturaCelsius);
	}
}
