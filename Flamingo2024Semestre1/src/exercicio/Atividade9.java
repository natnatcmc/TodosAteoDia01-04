package exercicio;

import java.util.Scanner;

public class Atividade9 {
    public static void main (String[]args) {
    	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o lado do quadrado: ");
	int lado= sc.nextInt();
	
	int resultado = lado* 2 ;
	System.out.println("A área do quadrado é:" + resultado);
	
	sc.close();
    }

}
