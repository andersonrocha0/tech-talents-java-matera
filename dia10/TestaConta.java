

public class TestaContaSaldoNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		Conta conta2 = new Conta();
		
		conta.setAgencia(1500);
		conta.setCliente("Manoel");
		conta.setNumero(6751);
		
		conta.setAgencia(1500);
		conta.setCliente("Cyntia");
		conta.setNumero(6752);
		
		System.out.println("O saldo da conta é: "+ conta.getSaldo());
		
		conta.deposita(500.0);

		System.out.println("O saldo da conta é: "+ conta.getSaldo());
		
		conta.saca(150.0);
		
		System.out.println("O saldo da conta é: "+ conta.getSaldo());
	
		conta.saca(200);
		
		System.out.println("O saldo da conta é: "+ conta.getSaldo());
		
		conta.transfere(100.0, conta2);
		
		System.out.println("O saldo da conta 1 é: "+ conta.getSaldo());
		System.out.println("O saldo da conta 2 é: "+ conta2.getSaldo());
		
		conta.transfere(200.0, conta2);
		
		System.out.println("O saldo da conta 1 é: "+ conta.getSaldo());
		System.out.println("O saldo da conta 2 é: "+ conta2.getSaldo());
	}
	
}
