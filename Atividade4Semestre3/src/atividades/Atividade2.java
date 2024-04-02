package atividades;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a altura: ");
		int altura= sc.nextInt();
		
		System.out.println("Insira o comprimento: ");
		int comprimento = sc.nextInt();
		
		System.out.println("Insira a largura: ");
		int largura = sc.nextInt();
		
		int resultadoVolume = altura * comprimento * largura;
		
		System.out.println("Volume = " + resultadoVolume);
		
		sc.close();
		
	}
	
}
