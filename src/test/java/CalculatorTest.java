import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @org.junit.jupiter.api.Test
    void add() {
        int a = 1;
        int b = 2;
        final double result = calculator.add(a, b);
        Assertions.assertEquals(3, result);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        int a = 2;
        int b = 3;
        //final double subtract = calculator.subtract(b, a);
        //Assertions.assertEquals(1, calculator.subtract(b, a));
        Assertions.assertEquals(1, calculator.subtract(b, a));
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Assertions.assertEquals(4, calculator.multiply(2, 2));
        Assertions.assertEquals(6, calculator.multiply(2, 3));
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