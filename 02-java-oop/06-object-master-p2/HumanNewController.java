public class HumanNewController {
    public static void main(String[] args) {
        HumanNew human1 = new HumanNew();
        HumanNew human2 = new HumanNew();
        Ninja ninja1 = new Ninja();
        ninja1.runAway();
        ninja1.steal(human1);

        Samurai samurai1 = new Samurai();
        samurai1.deathBLow(human1);
        Samurai.howMany();
        Samurai samurai2 = new Samurai();
        Samurai.howMany();
        samurai1.meditate();

        Wizard wizard1 = new Wizard();
        wizard1.heal(human2);
        wizard1.fireball(human2);


    }

}