package OrientacaodeObjeto;

public class Cliente {
	String nome;
	int id;
	String telefone;
	String cpf;
	String rg;
	String idade;
	String endereco;
	String genero;
	String estadoCivil;

	public String getNome() {
		return nome;	
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
    	this.id = id;
    }
	public String getTelefone() {
		return telefone;	
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;	
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRg() {
		return rg;	
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getIdade() {
		return idade;	
	}
	
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;	
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getGenero() {
		return genero;	
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	public String getestadoCivil() {
		return estadoCivil;
	}
	 
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	
	
	
	
	public String Comprar () {
		return "COMPRA realizada no dia 14/08/2024";
	}
    public String Pagar() {
    	return "Pagamento realizado com debito";
    }
    public String Pesquisar() {
    	return "produto já pesquisado";
    }
    public String Parcelar() {
    	return "Não foi parcelado";
    }


}
