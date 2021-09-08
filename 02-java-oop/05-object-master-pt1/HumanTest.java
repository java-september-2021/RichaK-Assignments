public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human(3, 3, 3, 100);
        int newHealth = human.attack(160);
        System.out.println(newHealth - human.getHealth());
    }
}
