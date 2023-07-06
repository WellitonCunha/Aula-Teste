package Polimorfismo;

public class Medico extends Pessoa {
	private int crm;
	private String especialidade;
	
	public int getCrm() {
		return crm;
	}
	
	public void setCrm(int crm) {
		this.crm = crm;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("-------------Médico----------------");
		System.out.println("Crm: "+crm);
		System.out.println("Especialidade: "+especialidade);
	}
}
