package atividadesExemplos;
import java.util.Scanner;

public class Exercicio01While {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro pra saber a tabuada dele!");
		
		int contador = 1;
		int numero = sc.nextInt();
		
		while ( contador <11) {
			System.out.println ("Resultado: " + numero + " X " + contador + " = " + numero * contador);
			contador = contador + 1;
		}
		
		sc.close();
	}
	
}
