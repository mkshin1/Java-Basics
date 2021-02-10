public class FizzBuzz {
    public String fizzBuzz(int number) {
        // fizzbuzz logic here
        // fizzBuzz is a string that is also a method which takes in 1 argument, which is the number?
        Integer copy_of_number = number;

        if(number % 3 == 0){
            return "fizz";
        }
        else if(number % 5 == 0){
            return "buzz";
        }
        else if(number % 3 == 0 && number % 5 == 0){
            return "fizzBuzz";
        }
        else{
            return Integer.toString(copy_of_number);
        }

    }
}