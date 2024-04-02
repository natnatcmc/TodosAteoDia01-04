package atividades;
import java.util.Scanner;

public class Atividade2 {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor= sc.nextInt();
		
		
		int resultado = valor - 1;
		System.out.println("O numero antecessor é: " + resultado);
		
		sc.close();
}
	}

