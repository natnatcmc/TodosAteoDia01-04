package atividades;
import java.util.Scanner;

/**
 * 3) Escreva um algoritmo para ler o 
 * salário mensal atual de um funcionário e o
 *  percentual de reajuste. Calcular e 
 *  escrever o valor do novo salário.
 */

public class Atividade3 {

	public static void main (String[]args){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println ("Digite o seu salário atual: ");
		double salarioAtual = sc.nextDouble();

		System.out.println ("Digite o percentual de reajuste: ");
		double salarioReajuste = sc.nextDouble();
		
		double reajusteReal = salarioReajuste / 100 ; 
		
		double total =  (salarioAtual * reajusteReal) + salarioAtual ;
		
		System.out.println("A soma do salário e a porcentagem de reajuste é: " + total );
		
		sc.close();
		
	}
	
	
	
}
