package atividades;

import java.util.Scanner;

public class Atividade2 {
	
	/**
	 * 
	 * 2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
	 *  Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
	 */
	

    public static void main (String[]args) {
    	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Digite o total de votos brancos:");
	double votosBrancos = sc.nextDouble();
	
	System.out.println("Digite o total de votos nulos: ");	
	double votosNulos = sc.nextDouble();
	
	System.out.println("Digite o total de votos válidos: ");
	
	double votosValidos = sc.nextDouble();
	double totalDeEleitores = votosBrancos + votosValidos + votosNulos;	
	
	double porcentualVotosBrancos = (votosBrancos * 100) / totalDeEleitores;
	double porcentualVotosValidos = (votosValidos * 100 )/ totalDeEleitores;
	double porcentualVotosNulos = (votosNulos * 100) / totalDeEleitores;
	
	
	System.out.println("Total de eleitores: " + totalDeEleitores + " eleitores; Percentual de votos brancos: " + porcentualVotosBrancos 
			+ "%; Percentual de votos validos: " + porcentualVotosValidos + "%; Percentual de votos nulos: " + porcentualVotosNulos + "%");
	
	sc.close();
	
    	}
}
