public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    private Calculator calculator;
    @BeforeEach
    void setUp() {
        System.out.println("Setup");
        calculator = new Calculator();
    }
    @AfterEach
    void tearDown() {
        System.out.println("Teardown");
    }
    @Test
    void testAddition() {
        int a = 10;
        int b = 20;
        int result = calculator.add(a, b);
        assertEquals(30, result);
    }
    @Test
    void testMultiplication() {
        int a = 5;
        int b = 4;
        int result = calculator.multiply(a, b);
        assertEquals(20, result);
    }
}
