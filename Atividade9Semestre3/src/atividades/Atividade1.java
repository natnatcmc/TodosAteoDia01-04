package atividades;

public class Atividade1 {

	public static void main(String[] args) {
		
		for (int i = 15; i < 201 ; i++) {
			
			int resultado = (int)(Math.pow(i,2));
			
			System.out.println("O quadrado de "+ i + " é: " + resultado);
		}
	}
}
