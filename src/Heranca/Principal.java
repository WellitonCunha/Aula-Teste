package Heranca;

import java.text.ParseException;
import java.util.Date;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Welliton");
		funcionario.setCpf("123123123");
		funcionario.setEscolaridade(3);
		funcionario.setTelefone("99 991939073");
		funcionario.setAdmissao("2021-06-03");
		
		String nome = funcionario.getNome();
		String cpf = funcionario.getCpf();
		int escolaridade = funcionario.getEscolaridade();
		String telefone = funcionario.getTelefone();
		Date admissao = funcionario.getAdmissao();		
		
		System.out.println("Nome: "+nome);
		System.out.println("Cpf: "+cpf);
		System.out.println("Escolaridade: "+escolaridade);
		System.out.println("Telefone: "+telefone);
		System.out.println("Admissão: "+admissao);

	}

}
