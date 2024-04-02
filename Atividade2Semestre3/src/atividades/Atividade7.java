package atividades;
import java.util.Scanner;

/**
 * 7) Calcular e apresentar o valor do volume de
 *  uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura
 */

public class Atividade7 {

    public static void main (String[]args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println ("Informe a altura da lata de óleo: ");
    	float altura = sc.nextFloat();
    	
    	System.out.println ("Informe o raio: ");
    	float raio = sc.nextFloat();
    	
    	System.out.println ("O total é:" + Math.PI * raio * 2 * altura);
    	
    	sc.close();
    }
}
