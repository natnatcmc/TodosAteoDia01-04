package atividades;
import java.util.Scanner;

public class Atividade4 {
	
	    public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor1= sc.nextInt();
		
		System.out.println("Digite um valor:");
		int valor2 = sc.nextInt();
		
		int resultado = valor1 - valor2;
		System.out.println("A subtração dos valores é:" + resultado);
		
		sc.close();
	}
}

