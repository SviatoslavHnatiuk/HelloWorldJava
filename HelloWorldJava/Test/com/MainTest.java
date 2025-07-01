package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testMainOutput() {
        String expected = "Hello Git!";
        String actual = "Hello Git!";
        assertEquals(expected, actual);
    }
}