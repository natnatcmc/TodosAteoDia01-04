package atividadesExemplos;
import java.util.Scanner;

public class Atividade1 {
	 public static void main(String[]args) {
		 
		 Scanner sc = new Scanner (System.in);
		 int numero;
		 int calculo;
		 String resposta = "sim";
		 
		 while (resposta.equals("sim")) {
		 System.out.println("Digite um valor:");
		 numero = sc.nextInt();
		 calculo = numero * 3;
		 
		 System.out.println("O valor da multiplicação é: " + calculo);
		 System.out.println("Deseja efetuar outro cálculo: ");
		 
		 resposta = sc.next();
		 
		 } 
	 }
}
