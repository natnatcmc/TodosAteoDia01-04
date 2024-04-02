package atividades;

import java.util.Scanner;

public class Atividade6 {
	
	public static void main(String[]arg){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println ("Digite a temperatura em graus Fahrenheit: ");
	
	float grausFahrenheit = sc.nextFloat();
	float grausCelsius = ((grausFahrenheit - 32)*5/9) ;
	
	System.out.println("O valor da temperatura é: " + grausCelsius + "C");
	
	sc.close();
	
	
}
}
