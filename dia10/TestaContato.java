
public class TestaContato {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		
		Endereco enderecoContato1 = new Endereco();
		enderecoContato1.setCep("0050-600");
		enderecoContato1.setCidade("Biscoito");
		enderecoContato1.setEstado("Padaria");
		enderecoContato1.setRua("Rua imaginaria");
		enderecoContato1.setNumero("271");
		
		Telefone telefoneContato1 = new Telefone();
		telefoneContato1.setDdd("11");
		telefoneContato1.setNumero("555-0828");
		telefoneContato1.setTipo("Celular");
		
		contato1.setEndereco(enderecoContato1);
		contato1.setTelefone(telefoneContato1);
		contato1.setNome("Xico bento");
		
		
//		contato1.setEndereco("Rua imaginaria, 271, 0050-600");
//		contato1.setTelefone("(11) 555-0828");
		
		Contato contato2 = new Contato();
		
		Endereco enderecoContato2 = new Endereco();
		enderecoContato2.setCep("0030-700");
		enderecoContato2.setCidade("Sonho");
		enderecoContato2.setEstado("Padaria");
		enderecoContato2.setRua("Rua do arco iris");
		enderecoContato2.setNumero("161");
		
		Telefone telefoneContato2 = new Telefone();
		telefoneContato2.setDdd("85");
		telefoneContato2.setNumero("777-0994");
		telefoneContato2.setTipo("Comercial");

		contato2.setTelefone(telefoneContato2);
		contato2.setEndereco(enderecoContato2);
		contato2.setNome("Xico Luis");
		
//		contato2.setEndereco("Rua do arco iris, 161, 0030-700");
//		contato2.setTelefone("(85) 777-0994");
		
		System.out.println("Informações do contato: " + contato1.getNome());
		System.out.println("CEP do Endereço: "+ contato1.getEndereco().getCep());
		System.out.println("DDD do Telefone: "+ contato1.getTelefone().getDdd());
		
		System.out.println("Informações do contato: " + contato2.getNome());
		System.out.println("CEP do Endereço: "+ contato2.getEndereco().getCep());
		System.out.println("DDD do Telefone: "+ contato2.getTelefone().getDdd());
		
	}
}
