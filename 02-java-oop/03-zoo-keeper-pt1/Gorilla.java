

public class Gorilla extends Mammal {

	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() {
		System.out.println("Gorilla has thrown something energy level  has decreased by 5");
		
	}
	
	
	public void eatBananas() {
		System.out.println("Gorilla is satisfied and energy level has increased by 10");
	}
	
	
	public void climb() {
		System.out.println("Gorilla has climbed tree and energy level has decreased by 10");
	}

}
