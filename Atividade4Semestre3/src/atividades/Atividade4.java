package atividades;
import java.util.Scanner;

public class Atividade4 {
	
	public static void main() {
	Scanner sc =  new Scanner (System.in);

	System.out.println ("Informe o valor em DOLAR");
	double dolar = sc.nextDouble();
	
	double dolarValor = 4.97;
	double resultado = dolar * dolarValor;
	
	
	System.out.println ("A conversão do valor de DOLAR pra REAL é:" + resultado);
	
	sc.close();
}
}
