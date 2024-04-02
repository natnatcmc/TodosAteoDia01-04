package atividades;

import java.util.Scanner;

public class Atividade5 {
	
	public static void main() {
	Scanner sc =  new Scanner (System.in);

	System.out.println ("Informe o valor em REAL");
	double real = sc.nextDouble();
	
	double dolarValor = 4.97;
	double resultado = real / dolarValor;
	
	
	System.out.println ("A conversão do valor de REAL pra DOLAR é:" + resultado);
	
	sc.close();
}
}
