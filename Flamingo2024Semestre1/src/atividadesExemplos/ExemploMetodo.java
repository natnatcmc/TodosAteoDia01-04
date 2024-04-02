package atividadesExemplos;

public class ExemploMetodo {

		static void meuMetodo (String fname, int idade) {
			System.out.println( fname + "Costa, " + idade);
		}
	
	public static void main(String[] args) {
		System.out.println("Nome pra colocar nos filhos:");
		meuMetodo("Luara ", 9);
		meuMetodo("Maite ", 4);
		meuMetodo("Vinicius ", 11);
	}

}
