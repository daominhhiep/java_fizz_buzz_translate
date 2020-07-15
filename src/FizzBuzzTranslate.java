public class FizzBuzzTranslate {
    public static final String MOD_3_AND_5 = "FizzBuzz";
    public static final String MOD_3 = "Fizz";
    public static final String MOD_5 = "Buzz";

    public static String translate(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return MOD_3_AND_5;
        }
        if (number % 3 == 0) {
            return MOD_3;
        }
        if (number % 5 == 0) {
            return MOD_5;
        }
        String string_number = String.valueOf(number);
        return string_number;
    }
}

