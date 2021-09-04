import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("Banana");
        myList.add("apple");
        myList.add("Papaya");
        myList.add(43);

        for (int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
            } catch (ClassCastException e) {
                System.out.println("Error on index : " + i + " with value : " + myList.get(i) + " Reason " + e);
            }

        }
    }
}
