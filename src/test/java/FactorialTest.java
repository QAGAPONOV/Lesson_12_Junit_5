import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @org.junit.jupiter.api.Test
    void calculateFactorial() {
        Factorial factorial = new Factorial();
        int actual = factorial.calculateFactorial(5);
        int expected = 120;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}