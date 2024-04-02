package atividades;

public class Atividade2 {
	public static void main(String[] args) {

		int somatorio = 0;
		
		for (int i = 1 ; i <= 500; i++) {
			if (i % 2 == 0 ) {
				somatorio += i;
			}
		}
		System.out.println("O somatório dos números pares entre 1  e 500 é:" + somatorio);
	}
}
