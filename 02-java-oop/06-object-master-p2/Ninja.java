public class Ninja extends HumanNew {

    public Ninja() {
        this.stealth = 10;
    }

    public void steal(HumanNew human) {
        human.health -= this.stealth;
        this.health += this.stealth;
        System.out.println("After stealing Ninja's health is : " + this.health);
    }

    public void runAway() {
        this.health -= 10;
        System.out.println("The ninja's health after runAway is : " + this.health);
    }

}
