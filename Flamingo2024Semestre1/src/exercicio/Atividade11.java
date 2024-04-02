package exercicio;

import java.util.Scanner;

public class Atividade11 {
    public static void main (String[]args) {
    	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a base maior de um trapézio:");
	int bmaior= sc.nextInt();
	
	System.out.println("Digite a base menor de um trapézio::");
	int bmenor = sc.nextInt();
	
	System.out.println("Digite a altura de um trapézio::");
	int altura = sc.nextInt();
	
	int resultado = (bmaior + bmenor) * altura / 2;
	System.out.println("A área de um trapézio é:" + resultado);
	
	sc.close();
    }
}
