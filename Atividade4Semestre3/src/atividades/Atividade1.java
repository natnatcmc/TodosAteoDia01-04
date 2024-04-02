package atividades;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor A: ");
		int valor = sc.nextInt();
		
		System.out.println("Informe o valor B: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Informe o valor C: ");
		int valor2 = sc.nextInt();
		
		System.out.println("Informe o valor D: ");
		int valor3 = sc.nextInt();
		
		System.out.println("Primeiro resultado feito com multiplicação: " + valor * valor1);
		System.out.println("Primeiro resultado feito com soma: " + valor + valor1);
		
		System.out.println("Segundo resultado feito com multiplicação: " + valor * valor2);
		System.out.println("Segundo resultado feito com soma: " + valor + valor2);
		
		System.out.println("Terceiro resultado feito com multiplicação: " + valor * valor3);
		System.out.println("Terceiro resultado feito com soma: " + valor + valor3);
		
		System.out.println("Quarto resultado feito com multiplicação: " + valor1 * valor2);
		System.out.println("Quarto resultado feito com soma: " + valor1 + valor2);
		
		System.out.println("Quinto resultado feito com multiplicação: " + valor1 * valor3);
		System.out.println("Quinto resultado feito com soma: " + valor1 + valor3);
		
		System.out.println("Sétimo resultado feito com multiplicação: " + valor3 * valor2);
		System.out.println("Sétimo resultado feito com soma: " + valor3 + valor2);
		
		sc.close();
}}
