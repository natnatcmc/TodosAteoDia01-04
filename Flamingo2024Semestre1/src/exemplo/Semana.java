package exemplo;

import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
		
		String resposta = "sim";
		
		while (resposta.equals("sim")||resposta.equals("Sim")) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um numero de 1 a 7, pra saber o dia da semana: ");
			int valor = sc.nextInt();
			
			if (valor==1){
				System.out.println("Hoje é DOMINGO!");
			} else if (valor==2) {
				System.out.println("Hoje é SEGUNDA!");
			} else if (valor==3) {
				System.out.println("Hoje é TERÇA-FEIRA!");
			} else if (valor==4) {
				System.out.println("Hoje é QUARTA-FEIRA!");
			} else if (valor==5) {
				System.out.println("Hoje é QUINTA-FEIRA");
			} else if (valor==6) {
				System.out.println("Hoje é SEXTA-FEIRA!");
			} else if (valor==7) {
				System.out.println("Hoje é SÁBADO!");
			} else { System.out.println("Houve um erro, digite um número de 1 a 7. ");
			
			}
			System.out.println("Deseja continuar?");
			resposta=sc.next();
			}}}
