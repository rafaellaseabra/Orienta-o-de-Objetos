package OrientacaodeObjeto;

public class ObjetoAviao {

	public static void main(String[] args) {

		Aviao aviao1 = new Aviao();


		//obj1

		aviao1.setNome("A320neo");
		aviao1.setCapacidade(174);
		aviao1.setMarca("Azul");
		aviao1.setModelo("Airbus320neo");
		



		System.out.println("-----OBJETO1-----");
		System.out.println(aviao1.getNome());
		System.out.println(aviao1.getCapacidade());
		System.out.println(aviao1.getMarca());
		System.out.println(aviao1.getModelo());
		System.out.println(aviao1.Voar());
		System.out.println(aviao1.Pousando());
		
	}

}
