
import java.util.Arrays;

public class PuzzleTest {

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        // Generating random numbers between 1 and 20 inclusive
        int[] randomNum = generator.getTenRolls(21);
        System.out.println("Random numbers: " + Arrays.toString(randomNum));
        // Generating random letter
        System.out.println("Random char: " + generator.getRandomLetter());
        // Generating password
        System.out.println("Random new Password : " + generator.generatePassword());

        // Generating new passwordset
        String[] words = generator.getNewPasswordSet(5);
        System.out.println("Random new Password Set: " + Arrays.toString(words));

    }

}
