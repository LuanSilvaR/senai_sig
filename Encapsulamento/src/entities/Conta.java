package entities;

public class Conta {
	
	protected int numeroDaConta;
	protected int agencia;
	protected String titular;
	protected double saldo;
	
	// Alt + Shift + S
	// generate Getters and Setter
	
	public void  depositar(double valor) {
		saldo += valor;
	}
	
	public void  sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Saldo insuficiente!");
		}else {
			saldo -= valor;
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return numeroDaConta + " \n" +
				agencia + " \n" +
				titular + " \n";
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public int getAgencia() {
		return agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
