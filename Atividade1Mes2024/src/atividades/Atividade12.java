package atividades;
import java.util.Scanner;

public class Atividade12 {
	
    public static void main (String[]args) {
    	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o raio do círculo:");
	float raio= sc.nextFloat();
	
	
	double resultado = Math.PI * (raio * raio);
	
	System.out.println("A área do círculo é: " + resultado);
	
	sc.close();
    }
}
