import java.util.Random;

public class PuzzleJava {

    public int[] getTenRolls(int num) {
        Random random = new Random();
        int[] arr = new int[10];
        for (var i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(num);
        }
        return arr;
    }

    public char getRandomLetter() {
        Random randomChar = new Random();
        char c = (char) (97 + randomChar.nextInt(26));
        return c;
    }

    public String generatePassword() {
        String returnStr = "";
        for (int i = 0; i < 8; i++) {
            returnStr += Character.toString(getRandomLetter());
        }
        return returnStr;
    }

    public String[] getNewPasswordSet(int n) {
        String[] newArr = new String[n];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = generatePassword();
        }
        return newArr;
    }

}
