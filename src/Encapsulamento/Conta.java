package Encapsulamento;

public class Conta {
	private float valor;
	private float saldo = 100;
	
	public void setValor(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public float getValor() {
		return valor;
	}
}
