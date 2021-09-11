public class HumanNew {

    protected int strength;
    protected int stealth;
    protected int intelligence;
    protected int health;

    public HumanNew() {
        this.intelligence = 3;
        this.stealth = 3;
        this.strength = 3;
        this.health = 100;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(HumanNew humanAttacked) {
        humanAttacked.health -= this.strength;

        System.out.println("The human attacked other human by  " + this.strength
                + " the other human who got attacked has health of " + humanAttacked.health);

    }

}