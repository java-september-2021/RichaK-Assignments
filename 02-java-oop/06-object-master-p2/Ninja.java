public class Ninja extends Human {

    public Ninja() {
        this.stealth = 10;
    }

    public void steal(Human human) {
        human.health -= this.stealth;
        this.health += this.stealth;
    }

    public void runAway() {
        this.health -= 10;
        System.out.println("The ninja's health is : " + this.health);
    }

}
