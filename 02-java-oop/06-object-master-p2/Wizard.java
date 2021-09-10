public class Wizard extends Human {

    int health;
    int intelligence;

    public Wizard() {
        this.health = 50;
        this.intelligence = 8;
    }

    public void heal(Human healedHuman) {
        healedHuman.health += super.intelligence;
        System.out.println("The healed human health is :  " + healedHuman.health);
    }

    public void fireball(Human anotherHuman) {
        anotherHuman.health -= super.intelligence * 3;
        System.out.println("The another human health is : " + anotherHuman.health);
    }

}