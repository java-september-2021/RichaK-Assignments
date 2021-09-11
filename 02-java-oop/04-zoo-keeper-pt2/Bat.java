
public class Bat extends Mammal2 {

    public Bat(int energyLevel) {
        super(energyLevel);

    }

    public void fly() {
        energyLevel -= 50;
        System.out.println("low thrumming sound a bat taking off and decrease its energy by " + energyLevel);
    }

    public void eatHumans() {
        energyLevel += 25;
        System.out.println("so- well, never mind , just increase its energy by " + energyLevel);
    }

    public void attackTown() {
        energyLevel -= 100;
        System.out.println("Town is on fire and decrease its energy by " + energyLevel);

    }

}
