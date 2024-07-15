package org.example.aufgabe3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsTest {
    // TODO Schreiben Sie mindestens 12 Tests. Die erwarteten Ergebnisse der sieben
    //  Tests sollen unterschiedlich sein.
    //  Erreichen Sie eine Test-Coverage von 100 % der Klasse RomanNumerals

    RomanNumerals number = new RomanNumerals();

    @Test
    public void romanNumbersEins() {
        String result = number.convert(1);
        assertEquals("I", result);
    }

    @Test
    public void romanNumbersZwei() {
        String result = number.convert(2);
        assertEquals("II", result);
    }

    @Test
    public void romanNumbersDrei() {
        String result = number.convert(3);
        assertEquals("III", result);
    }

    @Test
    public void romanNumbersFuenf() {
        String result = number.convert(5);
        assertEquals("V", result);
    }

    @Test
    public void romanNumbersZehn() {
        String result = number.convert(10);
        assertEquals("X", result);
    }

    @Test
    public void romanNumbersZwanzig() {
        String result = number.convert(20);
        assertEquals("XX", result);
    }

    @Test
    public void romanNumbersZwoelf() {
        String result = number.convert(12);
        assertEquals("XII", result);
    }

    @Test
    public void romanNumbersSechsUndZwanzig() {
        String result = number.convert(26);
        assertEquals("XXVI", result);
    }

    @Test
    public void romanNumbersFuenfzig() {
        String result = number.convert(50);
        assertEquals("L", result);
    }

    @Test
    public void romanNumbersVier() {
        String result = number.convert(4);
        assertEquals("IV", result);
    }
}