package principal;

import java.util.Scanner;

public class Exercicio01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor em real: ");
		double real = sc.nextDouble();

		System.out.println("A conversão em dolar é R$" + dolarSaida(real));
		
		System.out.println("********************************");
		
		System.out.println("Informe o valor em dolar: ");
		double dolar = sc.nextDouble();

		System.out.println("A conversão em real é $" + realSaida(dolar));
		
		sc.close();
	}

	static double dolarSaida(double dolarEntrada) {
		return (dolarEntrada * 4.99);
	}
	
	static double realSaida(double realEntrada) {
		return (realEntrada / 4.99);
	}

}



