package contas;

public class PessoaFisica {

	public static void main(String[] args) {
		Conta cc1 = new Conta();
		cc1.setCliente("Marcelo Canno");
		cc1.setsaldo(10000);
		System.out.println("Cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		System.out.println(".............");
		Conta cc2 = new Conta();
		cc2.setCliente("Luiz Matos");
		cc2.setsaldo(8500);
		System.out.println("Cliente: " + cc2.getCliente());
		cc2.exibirSaldo();
		cc2.depositar(5000);
		cc2.exibirSaldo();
		Conta cc3 = new Conta();
		cc1.setCliente("Roberto Santana");
		cc1.setsaldo(2000);
		System.out.println("Cliente: " + cc3.getCliente());
		cc1.exibirSaldo();
		cc1.sacar(1000);
		cc1.exibirSaldo();
		System.out.println(".............");
		System.out.println("..............");
		System.out.println("transferência");
		System.out.println("cliente: " + cc1.getCliente());
		System.out.println("Favorecido: " + cc2.getCliente());
		cc1.transferir(cc2,2000);
		System.out.println("");
		System.out.println("cliente: " + cc1.getCliente());
		cc1.exibirSaldo();
		System.out.println("Favorecido: " + cc2.getCliente());
		cc2.exibirSaldo();
		System.out.println("cliente: " + cc3.getCliente());
		cc1.exibirSaldo();
		System.out.println("..............");
		System.out.println("Relatório gerencial");
		Conta gerente = new Conta();
		double relatorio = gerente.soma(cc1.getsaldo(), cc2.getsaldo(), cc3.getsaldo());
		System.out.println("Saldo total nas contas: R$ " + relatorio);
		
	}
	
	

}
