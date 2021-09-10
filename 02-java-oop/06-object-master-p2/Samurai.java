public class Samurai extends Human {

    public Samurai() {
        this.health = 200;
    }

    public void deathBLow(Human human) {
        this.health = this.health / 2;

    }

    public void meditate() {

        this.health += 200 / 2;
    }

    public int howMany() {
        return this.health;
    }

}