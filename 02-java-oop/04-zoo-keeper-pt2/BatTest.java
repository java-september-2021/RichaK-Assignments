
public class BatTest {

	public static void main(String[] args) {
		Bat bat = new Bat(300);

		bat.eatHumans();
		bat.eatHumans();
		bat.displayEnergy();

		bat.fly();
		bat.fly();
		bat.displayEnergy();

		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		bat.displayEnergy();

	}

}