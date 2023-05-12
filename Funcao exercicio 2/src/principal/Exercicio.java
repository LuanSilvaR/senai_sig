package principal;

import java.util.Scanner;

public class Exercicio {

	// Faça um programa que receba o salario e a quantidade de vendas total
	// que o vendedor fez no mês, a quantidade de horas trabalhadas, o valor da
	// hora e calcule o salário do mês. Salário base do vendedor é 
	// R$13000,00. Há também o desconto de 5% do inss e 11% do IRPF sobre o salario bruto.
	
	
	
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



