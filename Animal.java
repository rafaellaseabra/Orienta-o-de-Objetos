package OrientacaodeObjeto;

public class Animal {
	
	double peso;
	int idade;
	String nome;
	String raça;
	
	
  
	public double getPeso() {
		return peso;	
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public int getidade() {
		return idade;
	}
	
	public void setIdade(int idade) {
    	this.idade = idade;
    }
	
	public String getnome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRaça() {
		return raça;
	}
	
	public void setRaça( String raça) {
		this.raça = raça;
	}
	////vaca////
	public String som(){
	   return "emite um som";
	}
	public String dormir() {
		return "dormir";
	}
	public String comer(){
	   return "comer" ;
   }
	public String leiteira() {
		return "50 litros";
	}
     ///// pintinho/////
	public String ciscar() {
		return "ciscando";
	}
	public String andar() {
		return "caminha";
	}
	
}
