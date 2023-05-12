package principal;

import java.util.Scanner;

public class maior {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int num1 = sc.nextInt();

		System.out.println("Informe outro número: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("Os número " + num1 + " é maior que " + num2);
		} else if (num2 > num1) {
			System.out.println("Os número " + num2 + " é maior que " + num1);
		}  else {
			System.out.println("Os números são iguais");
		} 

	}
}
