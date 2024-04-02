package atividades;

import java.util.Scanner;

public class Atividade6 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor A: ");
		double valor1 = sc.nextDouble();
		
		System.out.println("Insira o valor B: ");
		double valor2 = sc.nextDouble();
		
		System.out.println("Insira o valor C: ");
		double valor3 = sc.nextDouble();
		
		double resultado = (valor1 * valor1) + (valor2 * valor2) + (valor3 * valor3);
		
		System.out.println("A soma dos quadrados é: " + resultado);
		
		sc.close();
		
	}
}
