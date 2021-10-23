import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        final double result = calculator.add(a, b);
        Assertions.assertEquals(3, result);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
    }

    @org.junit.jupiter.api.Test
    void multiply() {
    }

    @org.junit.jupiter.api.Test
    void divide() {
    }

    @org.junit.jupiter.api.Test
    void modulo() {
    }

    @org.junit.jupiter.api.Test
    void sum() {
    }
}