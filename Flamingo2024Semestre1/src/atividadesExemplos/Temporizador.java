package atividadesExemplos;

public class Temporizador {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int minutos = 59; minutos > 0 ; minutos--) {
			for (int segundos =  59; segundos > 0; segundos--) {
				System.out.println(minutos + " : " + segundos  );
			}
		}
	}
}
