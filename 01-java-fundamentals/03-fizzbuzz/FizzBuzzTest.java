public class FizzBuzzTest{
    public static void main(String args[]){
        FizzBuzz tester = new FizzBuzz();

        System.out.println(tester.fizzBuzz(9));
        System.out.println(tester.fizzBuzz(10));
        System.out.println(tester.fizzBuzz(15));
        System.out.println(tester.fizzBuzz(16));
        System.out.println(tester.fizzBuzz(2));
        System.out.println(tester.fizzBuzz(3));
        System.out.println(tester.fizzBuzz(5));
        System.out.println(tester.fizzBuzz(23));

        System.out.println("---------------------------");
        System.out.println("---Implementing for loop---");

        
        for (int i = 1; i <= 50; i++) {
            System.out.println(tester.fizzBuzz(i));
        }

        System.out.println("-------------------");
		System.out.println("test Cases for Overlaoded Method");
		System.out.println("-------------------");
		System.out.println(tester.fizzBuzz(3, "multOf3Word", "multOf5Word", "multOf15Word"));
        System.out.println(tester.fizzBuzz(15, "multOf3Word", "multOf5Word", "multOf15Word"));
        System.out.println(tester.fizzBuzz(5, "multOf3Word", "multOf5Word", "multOf15Word"));
        System.out.println(tester.fizzBuzz(4, "multOf3Word", "multOf5Word", "multOf15Word"));

    }

}