public class FizzBuzzTranslate {
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public static String translate(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return FIZZ_BUZZ;
        }
        if (number % 3 == 0 || isContainedThree(number)) {
            return FIZZ;
        }
        if (number % 5 == 0 || isContainedFive(number)) {
            return BUZZ;
        }
        if (number < 100) {
            return readNumber(number);
        }
        return String.valueOf(number);
    }

    private static char[] getChars(int number) {
        String string_number = String.valueOf(number);
        return string_number.toCharArray();
    }


    private static boolean isContainedThree(int number) {
        char[] chars = getChars(number);
        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == '3') {
                return true;
            }
        }
        return false;
    }

    private static boolean isContainedFive(int number) {
        char[] chars = getChars(number);
        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == '5') {
                return true;
            }
        }
        return false;
    }

    private static String readNumber(int number) {
        char[] chars = getChars(number);
        String stringResult = "";
        int index = 0, whiteSpace = index + 1;
        for (; index < chars.length; index++, whiteSpace++) {
            switch (chars[index]) {
                case '1':
                    stringResult += "mot";
                    break;
                case '2':
                    stringResult += "hai";
                    break;
                case '4':
                    stringResult += "bon";
                    break;
                case '6':
                    stringResult += "sau";
                    break;
                case '7':
                    stringResult += "bay";
                    break;
                case '8':
                    stringResult += "tam";
                    break;
                case '9':
                    stringResult += "chin";
                    break;
            }
            if (whiteSpace < chars.length) {
                stringResult += " ";
            }
        }
        return stringResult;
    }
}

