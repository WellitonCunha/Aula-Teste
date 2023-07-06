package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		
		Medico medico = new Medico();
		
		medico.setNome("Welliton Cunha");
		medico.setCpf("121212121");
		medico.setTelefone("99 991939073");
		medico.setCrm(123);
		medico.setEspecialidade("Cardiologista");				
		medico.imprimir();
		
		System.out.println("-------------Professor----------------");
		
		Professor professor = new Professor();
		professor.setFaculdade("facimp");
		professor.setCurso("Sistemas de Informação");
		professor.setDisciplina("Programação Orientada a Objetos");
		professor.imprimir();

	}

}
