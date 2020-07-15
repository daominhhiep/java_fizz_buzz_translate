import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translate2() {
        String result = FizzBuzzTranslate.translate(2);
        assertEquals("hai",result);
    }
    @Test
    void translate3() {
        String result = FizzBuzzTranslate.translate(3);
        assertEquals("Fizz",result);
    }
    @Test
    void translate5() {
        String result = FizzBuzzTranslate.translate(5);
        assertEquals("Buzz",result);
    }
    @Test
    void translate15() {
        String result = FizzBuzzTranslate.translate(15);
        assertEquals("FizzBuzz",result);
    }
    @Test
    void translate26() {
        String result = FizzBuzzTranslate.translate(26);
        assertEquals("hai sau",result);
    }
    @Test
    void translate32() {
        String result = FizzBuzzTranslate.translate(32);
        assertEquals("Fizz",result);
    }
    @Test
    void translate56() {
        String result = FizzBuzzTranslate.translate(56);
        assertEquals("Buzz",result);
    }
    @Test
    void translate86() {
        String result = FizzBuzzTranslate.translate(86);
        assertEquals("tam sau",result);
    }
}