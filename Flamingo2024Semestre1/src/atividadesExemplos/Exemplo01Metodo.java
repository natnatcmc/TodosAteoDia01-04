package atividadesExemplos;

import java.util.Scanner;

public class Exemplo01Metodo {

	 static void primeiroMetodo() {
		 System.out.println("Olá! Estou estudando sobre métodos.");
		
	}
	 
	 static void primeiroMetodo2() {
		 System.out.println("Como é seu nome?");
		
	}
	 
	 public static void main (String[]args) {
		 primeiroMetodo();
		 primeiroMetodo2();
		 
		 for (int i = 0; i < 5; i++) {
			primeiroMetodo();
			primeiroMetodo2();
		}
	 }

}
