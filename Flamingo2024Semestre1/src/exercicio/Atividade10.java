package exercicio;

import java.util.Scanner;

public class Atividade10 {
    public static void main (String[]args) {
    	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o lado diagonal maior de um losango: ");
	int dmaior= sc.nextInt();
	
	System.out.println("Digite o lado diagonal menor de um losango: ");
	int dmenor = sc.nextInt();
	
	int resultado = dmaior + dmenor / 2;
	System.out.println("A área de um losango é:" + resultado);
	
	sc.close();
    }
}
