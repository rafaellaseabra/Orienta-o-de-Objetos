package OrientacaodeObjeto;

public class Cadeira {

	String modelo;
	String material;
	String cor;
	int capacPeso;
	double valor;
	
	public double getValor() {
		return valor;	
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double getCapcPeso() {
		return capacPeso;	
	}
	
	public void setCapacPeso(int capacPeso) {
		this.capacPeso = capacPeso;
	}
	public String getCor() {
		return cor;	
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;	
	}
	
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getModelo() {
		return modelo;	
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String girar() {
		return "Cadeira girando";
	}
	public String deitar() {
		return "Possui inclinação";
	}
	public String mover() {
		return "Move-se com rodas";
	}
	public String regular() {
		return "regulação para aumentar a altura";
	}
}
