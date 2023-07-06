package Heranca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoa {
	private int escolaridade;
	private Date admissao;
	
	public int getEscolaridade() {
		return escolaridade;
	}
	
	public void setEscolaridade(int escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	public Date getAdmissao() {
		return admissao;
	}
	
	public void setAdmissao(String admissao) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        
        Date data = formato.parse(admissao);
		this.admissao = data;
	}
	
}
