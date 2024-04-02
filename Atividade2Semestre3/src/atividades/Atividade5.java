package atividades;

import java.util.Scanner;

public class Atividade5 {
	
	public static void main(String[]arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Digite a temperatura em graus Celsius: ");
		
		float grausCelsius = sc.nextFloat();
		float grausFahrenheit = (9*grausCelsius+160)/5;
		
		System.out.println("O valor da temperatura é: " + grausFahrenheit + "F");
		
		sc.close();
		
		
		
	}
	
}
