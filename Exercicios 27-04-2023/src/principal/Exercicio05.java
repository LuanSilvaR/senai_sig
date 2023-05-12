package principal;

import java.util.Arrays;

public class Exercicio05 {
	
	public static void main(String[] args) {
	int[] numeros = new int[]{20,2, 8, 19, 100, 5, 1, 6, 13};
	
	Arrays.sort(numeros);

    System.out.println("Números ordenados:");
    for(int numero : numeros)
        System.out.println(numero);
    System.out.println();
	}
}

