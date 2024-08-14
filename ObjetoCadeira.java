package OrientacaodeObjeto;

public class ObjetoCadeira {

	public static void main(String[] args) {
		
		Cadeira cadeira1 = new Cadeira();
		Cadeira cadeira2 = new Cadeira();
		
		cadeira1.setModelo("Cadeira Gamer Fortt");
		cadeira1.setMaterial("Couro");
		cadeira1.setCor("Preta com Azul");
		cadeira1.setCapacPeso(120);
		cadeira1.setValor(499.00);
		
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println(cadeira1.getModelo());
		System.out.println(cadeira1.getMaterial());
		System.out.println(cadeira1.getCor());
		System.out.println(cadeira1.getCapcPeso());
		System.out.println(cadeira1.getValor());
		System.out.println(cadeira1.deitar());
		System.out.println(cadeira1.girar());
		System.out.println(cadeira1.regular());
    	System.out.println(cadeira1.mover()	);
				
				
		cadeira2.setModelo("Cadeira Dot purple");
		cadeira2.setMaterial("Assento estofado");
		cadeira2.setCor("Roxo");
		cadeira2.setCapacPeso(120);
		cadeira2.setValor(499.00);
		
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println(cadeira2.getModelo());
		System.out.println(cadeira2.getMaterial());
		System.out.println(cadeira2.getCor());
		System.out.println(cadeira2.getCapcPeso());
		System.out.println(cadeira2.getValor());
		System.out.println(cadeira2.deitar());
		System.out.println(cadeira2.girar());
		System.out.println(cadeira2.regular());
    	System.out.println(cadeira2.mover()	);
				
	}

}
