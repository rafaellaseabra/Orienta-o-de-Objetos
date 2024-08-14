package OrientacaodeObjeto;

public class ObjetoCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente();
        Cliente cliente2 =new Cliente();

		

		cliente1.setNome("Nome: João");
		cliente1.setId(0000000000);
	    cliente1.setTelefone("Telefone:1599123-4567");
        cliente1.setCpf("CPF: 12345678900");
        cliente1.setRg("RG: 0987654321");
        cliente1.setIdade("Idade: 23");
        cliente1.setEndereco("Endereço: rua das estrelas douradas; n200");
        cliente1.setGenero("Genero: Masculino");
        cliente1.setEstadoCivil("Estado Civil: Solteiro");
        
        System.out.println("* * * * * * * * * * * * * *");
		System.out.println("--------Clinte JOÃO-------");
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		System.out.println(cliente1.getIdade());
		System.out.println(cliente1.getEndereco());
		System.out.println(cliente1.getGenero());
		System.out.println(cliente1.getestadoCivil());
		System.out.println(cliente2.Pagar());
		System.out.println(cliente2.Pesquisar());
		System.out.println(cliente2.Parcelar());
		
		/////////////////
		
		cliente2.setNome("Nome: Cecília");
		cliente2.setId(12345678);
	    cliente2.setTelefone("Telefone: 1599098-7654");
        cliente2.setCpf("CPF: 0987654342");
        cliente2.setRg("RG: 09876543421");
        cliente2.setIdade("Idade: 18");
        cliente2.setEndereco("Endereço: rua professor José monteiro de carvalho; n 100");
        cliente2.setGenero("Genero: Feminino");
        cliente2.setEstadoCivil("Estado Civil: Solteira");
        
        System.out.println("* * * * * * * * * * * * * * * * *");
        System.out.println("--------Cliente Cecília--------");
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());
		System.out.println(cliente2.getIdade());
		System.out.println(cliente2.getEndereco());
		System.out.println(cliente2.getGenero());
		System.out.println(cliente2.getestadoCivil());
		System.out.println(cliente2.Comprar());
		System.out.println(cliente2.Pagar());
		System.out.println(cliente2.Pesquisar());
		System.out.println(cliente2.Parcelar());
	}

}
