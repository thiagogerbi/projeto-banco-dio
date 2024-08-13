package application;

import banco.Banco;
import banco.Cliente;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Cliente thiago = new Cliente();
		thiago.setNome("Thiago");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		Conta cc2 = new ContaCorrente(thiago);
		Conta poupanca2 = new ContaPoupanca(thiago);

		cc.depositar(100);
		cc.transferir(100, cc2);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();
		
	}

}
