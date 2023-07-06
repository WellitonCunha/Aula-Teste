package Polimorfismo;

public class Professor extends Pessoa {
	private String faculdade;
	private String curso;
	private String disciplina;
	
	public String getFaculdade() {
		return faculdade;
	}
	
	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	@Override
	public void imprimir() {
//		super.imprimir();
		System.out.println("Faculdade: "+faculdade);
		System.out.println("Curso: "+curso);
		System.out.println("Disciplina: "+disciplina);
	}
}
