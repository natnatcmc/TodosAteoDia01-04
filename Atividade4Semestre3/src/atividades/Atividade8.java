package atividades;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor A: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Insira o valor B: ");
		int valor2 = sc.nextInt();
		
		System.out.println("Insira o valor C: ");
		int valor3 = sc.nextInt();

		System.out.println("Insira o valor D: ");
		int valor4 = sc.nextInt();
		
		int variavelP = valor1 + valor3;
		int variavelS = valor2 + valor4;
		
		System.out.println("Variavel P " + variavelP + "Variavel S" + variavelS);
		
		sc.close();
		
	}
}
