package atividades;
import java.util.Scanner;

/**
 * 8) Efetuar o cálculo da quantidade de litros de combustível
 *  gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro.
 *  Para obter o cálculo, o usuário deve fornecer o tempo gasto
 *  
 * (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem.
 * Desta forma, será possível obter a distância percorrida com a fórmula
 * DISTANCIA=TEMPO * VELOCIDADE. 
 * Possuindo o valor da distância, basta calcular a quantidade de litros de combustível
 * utilizada na viagem com a fórmula LITROS_USADOS=DISTANCIA/12. Ao final, o programa
 * deve apresentar os valores da velocidade média (VELOCIDADE), tempo gasto na viagem (TEMPO),
 *  a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.
 */

public class Atividade8 {
	
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o tempo gasto: ");
		float tempo = sc.nextFloat();
		
		System.out.println("Informe a velocidade: ");
		float velocidade = sc.nextFloat();
		
		float distancia = tempo * velocidade;
		
		float litrosUsados = distancia/12;
		
		System.out.println("Velocidade média: " + velocidade + "; Tempo gasto na viagem: " + tempo + "; Distancia percorrida: " + distancia + "; Quantidade de litros: " + litrosUsados );
		
		sc.close();
		
	}
	
}
