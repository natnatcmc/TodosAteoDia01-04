package atividades;

import java.util.Scanner;

public class Atividade7 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor A: ");
		double valor1 = sc.nextDouble();
		
		System.out.println("Insira o valor B: ");
		double valor2 = sc.nextDouble();
		
		System.out.println("Insira o valor C: ");
		double valor3 = sc.nextDouble();
		
		double resultado = valor1 + valor2 + valor3;
		
		double quadradoSoma = resultado * resultado ;
		
		System.out.println("O quadrado da soma é: " + quadradoSoma);
		
		sc.close();
		
	}
}
