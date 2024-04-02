package atividades;
import java.util.Scanner;

public class Atividade10 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CANDIDATO A: Insira a totalidade de votos VÁLIDOS");
		int votoA = sc.nextInt();
		
		
		System.out.println("CANDIDATO B: Insira a totalidade de votos VÁLIDOS");
		int votoB = sc.nextInt();
		
		
		System.out.println("CANDIDATO C: Insira a totalidade de votos VÁLIDOS");
		int votoC = sc.nextInt();
		
		System.out.println("Insira a totalidade de votos BRANCOS ");
		int votoBranco = sc.nextInt();
		
		System.out.println("Insira a totalidade de votos NULOS");
		int votoNulo = sc.nextInt();
		
		
		int totaldeVotos = votoA + votoB + votoC + votoBranco + votoNulo;
		double percentualValidos = ((double)(votoA + votoB + votoC) / totaldeVotos) * 100;
		
		double percentualValidosA = ((double)votoA / totaldeVotos) * 100;
		
		double percentualValidosB = ((double)votoB / totaldeVotos) * 100;
		
		double percentualValidosC = ((double)votoC / totaldeVotos) * 100;
		
		double percentualNulos = ((double)votoNulo / totaldeVotos) * 100;
		double percentualBrancos = ((double)votoBranco / totaldeVotos) * 100;
		
		System.out.println("Total de votos dos candidatos" + totaldeVotos);
		System.out.println("Percentual de votos válidos candidatos: " + percentualValidos);
		System.out.println("Percentual de votos válidos candidatos A: " + percentualValidosA + "%");
		System.out.println("Percentual de votos válidos candidatos B: " + percentualValidosB + "%");
		System.out.println("Percentual de votos válidos candidatos C: " + percentualValidosC + "%");
		System.out.println("Percentual de votos Nulos: " + percentualNulos + "%");
		System.out.println("Percentual de votos Brancos: " + percentualBrancos + "%");
		
		sc.close();
	}
	
}
