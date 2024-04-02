package atividades;
import java.util.Scanner;

/**
 * 4) O custo de um carro novo ao consumidor é a soma do custo 
 * de fábrica com a porcentagem do distribuidor e dos impostos 
 * (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor 
 * seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo 
 * de fábrica de um carro, calcular e escrever o custo final ao consumidor.
 */

public class Atividade4 {
    public static void main (String[]args) {
    	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite o valor do carro:");
	double valorCarro = sc.nextDouble();
	
	double porcentualDistribuidor = (28 * valorCarro) /  100 ;
	double porcentualImpostos = (45 * valorCarro ) / 100;
	double total = porcentualDistribuidor + porcentualImpostos + valorCarro;
	
	
	System.out.println("Total: " + total);
	
	sc.close();
	
    	}
	
}
