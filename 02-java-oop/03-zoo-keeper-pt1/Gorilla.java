
public class Gorilla extends Mammal {

	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() {
		
		energyLevel -= 5;
		System.out.println("Gorilla has thrown something energy level  has decreased by : " +  energyLevel);		
	}
	
	
	public void eatBananas() {
		
		energyLevel += 10;
		System.out.println("Gorilla is satisfied and energy level has increased by : " +  energyLevel);
		
	}
	
	
	public void climb() {
		energyLevel -= 10;
		System.out.println("Gorilla has climbed tree and energy level has decreased by :" +  energyLevel);
	}

}
