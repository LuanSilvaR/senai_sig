package principal;

//import java.util.Locale;
import java.util.Scanner;


public class Exercicio07 {

	public static void main(String[] args) {

		//Locale ponto = new Locale("en", "us");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe nota do primeiro semestre: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Informe nota do segundo semestre: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Informe nota do terceiro semestre: ");
		double nota3 = sc.nextDouble();
		
		System.out.println("Informe nota do quarto semestre: ");
		double nota4 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		if (media < 6 ) {
			System.out.println("Sua média foi "+ media +". Aluno reprovado");
		}else if(media >= 6 && media < 7) {
			System.out.println("Sua média foi "+ media +". Aluno de recuperação");
		}else if(media >= 7 && media < 10) {
			System.out.println("Sua média foi "+ media +". Aluno aprovado");
		}else if(media > 9.99 && media < 10.01) {
			System.out.println("Sua média foi "+ media +". Aluno aprovado com horas");
		}else if(media > 10.01) {
			System.out.println("verifique valores informados! Média não pode ser maior que 10");
		}else {
			System.out.println("verifique valores informados! Erro ao calcular média");
		}
		
		sc.close();

	}

}

