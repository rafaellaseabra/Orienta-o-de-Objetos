package OrientacaodeObjeto;

public class Aviao {
		String nome;
		int capacidade;
		String marca;
		String modelo;
		String pousando;

		public String getNome() {
			return nome;	
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public int getCapacidade() {
			return capacidade;
		}
		
		public void setCapacidade(int capacidade) {
	    	this.capacidade = capacidade;
	    }
		
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		public String getModelo() {
			return modelo;
		}
		
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		public String Voar() {
			return "voando";
		}
		
		public String Pousando() {
			return "pousando";
		}

	}

