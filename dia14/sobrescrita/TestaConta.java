package sobrescrita;

public class TestaConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.setSaldo(15.6);
		
		
		ContaPoupanca cp = new ContaPoupanca();
		cp.setSaldo(16.6);
		
		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());
		
		cc.saca(5);
		cp.saca(5.6);
		
		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());
		
		
		
	}
}
