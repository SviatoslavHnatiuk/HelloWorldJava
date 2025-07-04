package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MainTest {

    // Test klasa Main

    @Test
    void testChoice() {
        assertEquals("Hello, world!", Main.choice(1));
        assertEquals("Autor: Sviatoslav Hnatiuk. V1", Main.choice(2));
        assertEquals("Koniec", Main.choice(3));
        assertEquals(" ", Main.choice(999));
    }

    @Test
    void testSlashN() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Main.slashN();

        System.setOut(originalOut);

        assertEquals("\n\n", output.toString());
    }

    @Test
    void testMain_withDifferentInputs() throws InterruptedException {
        String simulatedInput = "1\n2\n999\n3\n";
        ByteArrayInputStream input = new ByteArrayInputStream(simulatedInput.getBytes());
        System.setIn(input);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        Main.main(new String[]{});

        System.setOut(originalOut);
        System.setIn(System.in);

        String outString = output.toString();

        assertTrue(outString.contains("Hello, world!"));
        assertTrue(outString.contains("Autor: Sviatoslav Hnatiuk. V1"));
        assertTrue(outString.contains(" "));
        assertTrue(outString.contains("Koniec"));
    }

    // Test klasa Calculator

    @Test
    void testCalculatorAdd() {
        Calculator calc = new Calculator();
        assertEquals(7, calc.add(3, 4));
    }

    @Test
    void testCalculatorSubtract() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(5, 4));
    }

    @Test
    void testCalculatorMultiply() {
        Calculator calc = new Calculator();
        assertEquals(12, calc.multiply(3, 4));
    }

    @Test
    void testCalculatorDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void testCalculatorDivideByZero() {
        Calculator calc = new Calculator();
        assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
    }
    @Test
    void testPower() {
        Calculator calc = new Calculator();
        assertEquals(8, calc.power(2, 3));  // 2^3 = 8
        assertEquals(1, calc.power(5, 0));  // każda liczba do potęgi 0 = 1
    }
}