package atividades;
import java.util.Scanner;

public class Atividade8 {
	
    public static void main (String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a base do triângulo :");
	int base= sc.nextInt();
	
	System.out.println("Digite a altura do triângulo :");
	int altura = sc.nextInt();
	
	int resultado = base * altura / 2;
	System.out.println("A área do triângulo é:" + resultado);
	
	sc.close();
    }
}
