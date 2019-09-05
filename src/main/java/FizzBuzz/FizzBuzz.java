package FizzBuzz;

public class FizzBuzz {

    public static String of(int i) {

        if (isQiuzheng(i,3)&&isQiuzheng(i,5)) {
            return"FizzBuzz";
        }
        if (isQiuzheng(i, 3)) return "Fizz";
        if (isQiuzheng(i, 5)) return "Buzz";

        return String.valueOf(i);
    }

    private static boolean isQiuzheng(int i, int i2) {
        if (i % i2 == 0 || String.valueOf(i).contains(String.valueOf(i2))) {
            return true;
        }
        return false;
    }

}
