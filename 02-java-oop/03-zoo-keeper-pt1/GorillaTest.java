
public class GorillaTest {

	public static void main(String[] args) {
		
		Mammal mammal = new Mammal(100);
		
		
		Gorilla gorilla = new Gorilla(80);
		
		gorilla.climb();
		gorilla.climb();
		gorilla.climb();
		
		gorilla.displayEnergy();
		
		
		gorilla.eatBananas();
		
		gorilla.eatBananas();
		
		gorilla.displayEnergy();
		
		gorilla.throwSomething();
		
		gorilla.displayEnergy();
		

	}

}