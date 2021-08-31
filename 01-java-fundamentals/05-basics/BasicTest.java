public class BasicTest{
    public static void main(String args[]){
        int [] numArray = {1,3,5,7,9,13};
        int [] numArray2 = {-3,-5,-7,0};
        int [] numArray3 = {2,10,3};
        BasicJava basic = new BasicJava();
        // System.out.println("\n");
        // System.out.println("*** Printing Number from 1 to 255 ***");
        // basic.printNum(255);
        // System.out.println("\n");
        // System.out.println("*** Printing  Odd Numbers ***");
        // basic.oddNum(255);
        // System.out.println("\n");
        // System.out.println("*** Printing  Sum  of 255 ***");
        // System.out.println("The sum is : " + basic.sum(255));
        // System.out.println("\n");
        // System.out.println("*** Iterating thru an array ***");
        // basic.iterateThruArray(numArray);
        // System.out.println("\n");
        // System.out.println("*** Finding Max Num in an array of mixed negative nums ***");
        // System.out.println(basic.findMax(numArray2));
        // System.out.println("\n");
        // System.out.println("*** Finding Max Num in an array of positive nums ***");
        // System.out.println(basic.findMax(numArray));
        // System.out.println("\n");
        // System.out.println("***Returning array with odd number ***");
        // basic.oddNumbers(255);
        // System.out.println("\n");
        // System.out.println("*** Printing average ***");
        // System.out.println(basic.getAverage(numArray2));
        // System.out.println(basic.getAverage(numArray));
        // System.out.println(basic.getAverage(numArray3));
        System.out.println("\n");
        System.out.println("*** Greater than Y ***");
        System.out.println(basic.greaterThanY(numArray, 5));
        System.out.println(basic.greaterThanY(numArray3, 5));
        System.out.println(basic.greaterThanY(numArray2, -5));
        System.out.println("\n");
        System.out.println("*** Square values ***");
        basic.squareValues(numArray3);
        System.out.println("*** Square values ***");
        basic.squareValues(numArray2);
        System.out.println("*** Square values ***");
        basic.squareValues(numArray);

    }
}