package Abstracao;

class Cachorro extends Animal {
	
	public Cachorro(String nome) {
		super(nome);
	}
	
	public void fazerSom() {
		System.out.println("O cachorro Late.");
	}
}
