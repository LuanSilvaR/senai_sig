package principal;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {

		/*
		 * Fa�a um programa que pe�a a temperatura em graus celsius, transforme e
		 * mostre a temperatura em graus Fahrenhei (0 �C � 9/5) + 32 = 32 �F

		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a tempera em Celsius: ");
		double temperaturaCelsius  = sc.nextDouble();

		sc.close();

		double temperaturaFahrenheit = ((temperaturaCelsius * 9 /5)+32);

		System.out.println(temperaturaCelsius + " em graus Celsius"
				+ ", convertido em graus Fahrenheit � igual a " + temperaturaFahrenheit);
	}
}
