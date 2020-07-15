import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    FizzBuzzTranslate fizzBuzzTranslate = new FizzBuzzTranslate();

    @Test
    void translate2() {
        String result = fizzBuzzTranslate.translate(2);
        assertEquals("hai", result);
    }

    @Test
    void translate3() {
        String result = fizzBuzzTranslate.translate(3);
        assertEquals("Fizz", result);
    }

    @Test
    void translate5() {
        String result = fizzBuzzTranslate.translate(5);
        assertEquals("Buzz", result);
    }

    @Test
    void translate15() {
        String result = fizzBuzzTranslate.translate(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void translate26() {
        String result = fizzBuzzTranslate.translate(26);
        assertEquals("hai sau", result);
    }

    @Test
    void translate32() {
        String result = fizzBuzzTranslate.translate(32);
        assertEquals("Fizz", result);
    }

    @Test
    void translate56() {
        String result = fizzBuzzTranslate.translate(56);
        assertEquals("Buzz", result);
    }

    @Test
    void translate86() {
        String result = fizzBuzzTranslate.translate(86);
        assertEquals("tam sau", result);
    }
}