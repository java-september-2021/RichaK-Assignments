public class FizzBuzz{
    public String fizzBuzz(int number){
        String message;
        if((number % 3 == 0) && (number % 5 == 0)){
            message = "FizzBuzz";
        }else if(number % 3 == 0){
            message = "Fizz";
        }else if(number % 5 == 0){
            message = "Buzz";
        }else{
            message = String.valueOf(number);
        }
        return message;
    }

    public String fizzBuzz(int number, String multOf3Word, String multOf5Word, String multOf15Word) {
		if ((number % 3 == 0) && (number % 5 == 0)) {
			return "multOf15Word";
		} else if (number % 3 == 0) {
			return "multOf3Word";
		} else if (number % 5 == 0) {
			return "multOf5Word";
		} else {
			return String.valueOf(number);
		}
	}
    
}