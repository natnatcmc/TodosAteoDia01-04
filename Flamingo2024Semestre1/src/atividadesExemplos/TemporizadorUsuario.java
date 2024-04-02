package atividadesExemplos;

import java.util.Scanner;

public class TemporizadorUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		System.out.println("Insira os minutos");
		int minutos1 = sc.nextInt();
		
		System.out.println("Insira os segundos");
		int segundos1 = sc.nextInt();
		
		
		for (int minutos = minutos1 ; minutos > 0 ; minutos--) {
			for ( int segundos = segundos1 ; segundos > 0; segundos--) {
				System.out.println(minutos + " : " + segundos  );
			}
			
	}
		sc.close();
	}
	}