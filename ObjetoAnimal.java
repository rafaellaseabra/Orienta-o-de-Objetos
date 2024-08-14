package OrientacaodeObjeto;

public class ObjetoAnimal {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		Animal bezerro = new Animal();
		Animal cachorro = new Animal();
		Animal cabra = new Animal();
		Animal coelho = new Animal();
		Animal pintinho = new Animal();
		Animal galinha = new Animal();
		
		
		
		
		animal1.setNome("Lolo");
		animal1.setIdade(19);
		animal1.setPeso(470);
		animal1.setRaça("Holstein-Frísia");
		
		System.out.println ("***************VACA******************");
		System.out.println(animal1.getnome());
		System.out.println(animal1.getidade());
		System.out.println(animal1.getPeso());
		System.out.println(animal1.getRaça());
		System.out.println(animal1.som());
		System.out.println(animal1.dormir());
		System.out.println(animal1.comer());
		
       ///////////////////////////////////
		
		bezerro.setNome("lolozinho");
		bezerro.setIdade(1);
		bezerro.setPeso(380);
		bezerro.setRaça("Braford");
		
		System.out.println ("***************BEZERRO******************");
		System.out.println(bezerro.getnome());
		System.out.println(bezerro.getidade());
		System.out.println(bezerro.getPeso());
		System.out.println(bezerro.getRaça());
		System.out.println(bezerro.som());
		System.out.println(bezerro.dormir());
		System.out.println(bezerro.comer());
		System.out.println(bezerro.leiteira());
		
		
		////////////////////////////////
		cachorro.setNome("Bela");
		cachorro.setIdade(6);
		cachorro.setPeso(22);
		cachorro.setRaça("shin tzu");
		
		System.out.println ("****************CACHORRO*****************");
		System.out.println(cachorro.getnome());
		System.out.println(cachorro.getidade());
		System.out.println(cachorro.getPeso());
		System.out.println(cachorro.getRaça());
		System.out.println(cachorro.som());
		System.out.println(cachorro.dormir());
		System.out.println(cachorro.comer());
		//////////////////////////////////////////////////////
		
		cabra.setNome("LILI");
		cabra.setIdade(13);
		cabra.setPeso(45);
		cabra.setRaça("Holstein-Frísia");
		
		System.out.println ("***************CABRA******************");
		System.out.println(cabra.getnome());
		System.out.println(cabra.getidade());
		System.out.println(cabra.getPeso());
		System.out.println(cabra.getRaça());
		System.out.println(cabra.som());
		System.out.println(cabra.dormir());
		System.out.println(cabra.comer());
		System.out.println(cabra.andar());
		////////////////////////////////////////////////////////////////
		
		coelho.setNome("zaza");
		coelho.setIdade(4);
		coelho.setPeso(1);
		coelho.setRaça("Rex");
		
		System.out.println ("***************COELHO******************");
		System.out.println(coelho.getnome());
		System.out.println(coelho.getidade());
		System.out.println(coelho.getPeso());
		System.out.println(coelho.getRaça());
		System.out.println(coelho.som());
		System.out.println(coelho.dormir());
		System.out.println(coelho.comer());
		System.out.println(coelho.andar());
		//////////////////////////////////////////////////////////////
		
		pintinho.setNome("zuzu");
		pintinho.setIdade(1);
		pintinho.setPeso(0.35);
		pintinho.setRaça("Legorne");
		
		System.out.println ("**************PINTINHO******************");
		System.out.println(pintinho.getnome());
		System.out.println(pintinho.getidade());
		System.out.println(pintinho.getPeso());
		System.out.println(pintinho.getRaça());
		System.out.println(pintinho.som());
		System.out.println(pintinho.dormir());
		System.out.println(pintinho.comer());
		System.out.println(pintinho.ciscar());
	}

}
