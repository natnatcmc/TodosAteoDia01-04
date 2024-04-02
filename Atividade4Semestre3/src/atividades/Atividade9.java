package atividades;

import java.util.Scanner;

public class Atividade9 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o seu salário mensal: ");
		int SM = sc.nextInt();

		System.out.println("Insira o valor do percentual de reajuste: ");
		int PR = sc.nextInt();
		
		int NS = SM + PR;
		
		System.out.println("Salário com reajuste: " + NS);
		
		sc.close();
		
	}
}
