package atividades;
import java.util.Scanner;

/**
 * 10) Ler dois valores (inteiros, reais ou caracteres)
 *  para as variáveis A e B, e efetuar a troca dos valores
 *  de forma que a variável A passe a possuir o valor da variável
 *  B e a variável B passe a possuir o valor da variável A.
 *  Apresentar os valores trocados.
 * 
 */

public class Atividade10 {

	public static void main(String[]Args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Valor 'A': ");
		int valorA = sc.nextInt();

		System.out.println("Valor 'B': ");
		int valorB = sc.nextInt();
		
		valorA = valorA + valorB;
		valorB = valorA - valorB;
		valorA = valorA - valorB;
		
		System.out.println("Troca de valores do valor 'A': " + valorA + ", Troca de valores do valor 'B'" + valorB);		
		
		sc.close();
	}
	
}
