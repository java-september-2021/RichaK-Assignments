import java.util.ArrayList;

public class Exceptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("Banana");
        myList.add("apple");
        myList.add("Papaya");
        myList.add(43);
        try {
            for (int i = 0; i < myList.size(); i++) {
                Integer castedValue = (Integer) myList.get(i);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
