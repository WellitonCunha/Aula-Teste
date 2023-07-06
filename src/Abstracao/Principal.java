package Abstracao;

public class Principal {

	public static void main(String[] args) {
		
		Animal cachorro = new Cachorro("Ruck");
		Animal gato = new Gato("Fred");
		
		cachorro.fazerSom();		
		System.out.println("Nome do Cachorro: "+cachorro.getNome());
		gato.fazerSom();
		System.out.println("Nome do Gato: "+gato.getNome());

	}

}
