package Encapsulamento;

public class Principal {

	public static void main(String[] args) {

		 Pessoa pessoa = new Pessoa();
		 
		 pessoa.setNome("Welliton");
		 pessoa.setIdade(31);
		 
		 String nome = pessoa.getNome();
		 int idade = pessoa.getIdade();
		 
		 System.out.println("Nome: "+nome);
		 System.out.println("Idade: "+idade);
		
//		Conta conta = new Conta();
//		
//		conta.setValor(200);
////		conta.saldo = 1000;
//		Float saldo = conta.getSaldo();
//		
//		
//		System.out.println("Saldo: "+saldo);
		 
		 
	}

}
