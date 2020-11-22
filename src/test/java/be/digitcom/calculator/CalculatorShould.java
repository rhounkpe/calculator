package be.digitcom.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorShould {
    private Calculator calculator = new Calculator();

    @Test
    public void sum() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test void substract() {
        assertEquals(3, calculator.substract(5, 2));
    }
}