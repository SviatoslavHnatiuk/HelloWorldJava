package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class IntegrationTest {
    @Test
    void testMainAndCalculatorIntegration() {
        Calculator calc = new Calculator();

        int a = 10;
        int b = 5;

        int sum = calc.add(a, b);
        int diff = calc.subtract(a, b);

        String wynikSuma = "Wynik dodawania: " + sum;
        String wynikRoznica = "Wynik odejmowania: " + diff;

        assertEquals("Wynik dodawania: 15", wynikSuma);
        assertEquals("Wynik odejmowania: 5", wynikRoznica);
    }
}
