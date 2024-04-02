package atividades;

import java.util.Scanner;

/**
 * 1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses
 *  e dias e escreva a idade dessa pessoa expressa apenas em dias.
 *  Considerar ano com 365 dias e mês com 30 dias.
 */

public class Atividade1 {
	

    public static void main (String[]args) {
    	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite sua idade completa atual: ");
	int anos = sc.nextInt();
	
	System.out.println("Digite a quantidade de meses desde seu último aniversário: ");	
	int meses = sc.nextInt();
	
	System.out.println("Digite a quantidade de dias que passou desde seu último mesversário: ");
	int dias = sc.nextInt();
	
	int quantidadeDeDiasVividos = anos * 365 + meses * 30 + dias;
	
	System.out.println("Sua idade é: " + quantidadeDeDiasVividos);
	
	sc.close();
	
    	}
}
