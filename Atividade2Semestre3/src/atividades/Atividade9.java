package atividades;
import java.util.Scanner;

/**
 * 9) Efetuar o cálculo e a apresentação do valor
 *  de uma prestação em atraso, utilizando a fórmula
 *   PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).
 */

public class Atividade9 {
	 public static void main(String[]args) {
		 Scanner sc = new Scanner(System.in); 
		 
		 System.out.println("Valor da prestação: ");
		 float valor = sc.nextFloat();
		 
		 System.out.println("Insira o valor da taxa: ");
		 float taxa = sc.nextFloat();
		 
		 System.out.println("Insira o tempo de atraso: ");
		 float tempo = sc.nextFloat();
		 
		 float prestacao = valor + (valor * taxa / 100) * tempo;
		 
		 System.out.println("O resultado é: " + prestacao);
		 
		 sc.close();
		 
	 }
}
