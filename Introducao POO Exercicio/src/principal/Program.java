package principal;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Carro carro1 = new Carro();
		Carro carro2 = new Carro();

		System.out.println("Informe o modelo");
		carro1.modelo = sc.nextLine();
		System.out.println("Informe a cor");
		carro1.cor = sc.nextLine();
		System.out.println("Informe a placa");
		carro1.placa = sc.nextLine();
		System.out.println("Informe tipo de cambio");
		carro1.tipoCambio = sc.nextLine();

		System.out.println("Informe o modelo");
		carro2.modelo = sc.nextLine();
		System.out.println("Informe a cor");
		carro2.cor = sc.nextLine();
		System.out.println("Informe a placa");
		carro2.placa = sc.nextLine();
		System.out.println("Informe tipo de cambio");
		carro2.tipoCambio = sc.nextLine();

		System.out.println(carro1);
		System.out.println("*********************");
		System.out.println(carro2);
		
		sc.close();

	}

}
