package contas;

public class Conta {
	// Aulas Professor José de Assis Filho
	private String cliente;
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	private double saldo;
	public double getsaldo() {
		return saldo;
	}
	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}
	public Conta() {
		System.out.println("Agencia 0244");
		
	}
	protected void exibirSaldo() {
		System.out.println("Saldo: R$: " + saldo);
	}
	void sacar(double valor) {
		saldo -= valor;
		System.out.println("Debito: R$" + valor);
	}
	void depositar(double valor) {
		saldo += valor;
		System.out.println("Credito: R$" + valor);
	}
	void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: R$" + valor);
	}
	double soma(double cc1,double cc2,double cc3) {
		double total = cc1 + cc2;
		return total;
	}
}
