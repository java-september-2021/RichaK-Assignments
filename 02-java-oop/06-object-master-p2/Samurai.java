public class Samurai extends HumanNew {
    static int numOfSamurai = 0;

    public Samurai() {
        this.health = 200;
        numOfSamurai++;
    }

    public void deathBLow(HumanNew human) {
        human.health = 0;
        this.health = this.health / 2;
        System.out.println("After killing another human the Samurai's health is : " + this.health);

    }

    public void meditate() {

        this.health += (this.health / 2);
        System.out.println("After meditate the the healed samurai's health is :" + this.health);
    }

    public static void howMany() {
        System.out.println("The number of samurai's created : " + numOfSamurai);
    }

}