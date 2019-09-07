package FizzBuzz;

public class FizzBuzz {
    private int number;

    public FizzBuzz(int number) {

        this.number = number;
    }

    public static String of(int i) {


        if (i <=0){
            throw new IllegalArgumentException();
        }

        FizzBuzz fizzBuzz = new FizzBuzz(i);



        if (fizzBuzz.isDiviaibleBy(3) && fizzBuzz.isDiviaibleBy(5)|| fizzBuzz.contains(3)&&fizzBuzz.contains(5)) {
            return "FizzBuzz";
        }
        if (fizzBuzz.isDiviaibleBy(3) || fizzBuzz.contains(3)) {
            return "Fizz";
        }
        if (fizzBuzz.isDiviaibleBy(5)||fizzBuzz.contains(5)) {
            return "Buzz";
        }

        return String.valueOf(i);

    }

    private boolean contains(int i) {
        if (String.valueOf(number).contains(String.valueOf(i)))
            return true;
        return false;
    }

    private boolean isDiviaibleBy(int i2) {
        return this.number % i2 == 0;
    }
}
