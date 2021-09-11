public class Wizard extends HumanNew {

    public Wizard() {
        this.health = 50;
        this.intelligence = 8;
    }

    public void heal(HumanNew healedHuman) {
        healedHuman.health += this.intelligence;
        System.out.println("The healed human health is :  " + healedHuman.health);
    }

    public void fireball(HumanNew anotherHuman) {
        anotherHuman.health -= this.intelligence * 3;
        System.out.println("The another human health after fireball attack is : " + anotherHuman.health);
    }

}