package principal;

import java.util.Scanner;

public class maior {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero: ");
		int num1 = sc.nextInt();

		System.out.println("Informe outro n�mero: ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("Os n�mero " + num1 + " � maior que " + num2);
		} else if (num2 > num1) {
			System.out.println("Os n�mero " + num2 + " � maior que " + num1);
		}  else {
			System.out.println("Os n�meros s�o iguais");
		} 

	}
}
