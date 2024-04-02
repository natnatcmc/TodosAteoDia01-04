package atividades;
import java.util.Scanner;

public class Atividade3 {

	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor A (por favor coloque um nmr inteiro)");
		int A = sc.nextInt();
		
		System.out.println("Digite o valor B (por favor coloque um nmr inteiro)");
		int B = sc.nextInt(); 
		
		int diferenca = A - B;
		int quadradoDiferenca = diferenca * diferenca;
		
		System.out.println("O  quadrado da digerença entre A e B é: " + quadradoDiferenca);
		
		sc.close();
	}
}
