package org.example.aufgabe2;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StreamsUebenTest {

    private StreamsUeben streamsUeben = new StreamsUeben();

    @Test
    public void filterNamesStartingWithA() {
        List<String> input = List.of("Anna", "Ben", "Amelie");
        List<String> result = streamsUeben.filterNamesStartingWith(input, 'A');
        List<String> expected = List.of("Ben");
        assertEquals(expected, result);
    }

    @Test
    public void filterNamesStartingWithAAlleWerdenGefiltert() {
        List<String> input = List.of("Anna");
        List<String> result = streamsUeben.filterNamesStartingWith(input, 'A');
        assertEquals(Collections.EMPTY_LIST, result);
    }

    @Test
    public void filterNamesStartingWithAKeinerWirdGefiltert() {
        List<String> input = List.of("Ben", "Constanze", "Klara");
        List<String> result = streamsUeben.filterNamesStartingWith(input, 'A');
        assertEquals(input, result);
    }

    @Test
    public void filterNamesStartingWithC() {
        List<String> input = List.of("Ben", "Constanze", "Klara");
        List<String> result = streamsUeben.filterNamesStartingWith(input, 'C');
        List<String> expected = List.of("Ben", "Klara");
        assertEquals(expected, result);
    }


    @Test
    public void add5ToInputValues() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = streamsUeben.addNumberToEach(input, 5);
        List<Integer> expected = List.of(6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals(expected, result);
    }

    @Test
    public void add0ToInputValues() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = streamsUeben.addNumberToEach(input, 0);
        assertEquals(input, result);
    }

    @Test
    public void add10ToInputValues() {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = streamsUeben.addNumberToEach(input, 10);
        List<Integer> expected = List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        assertEquals(expected, result);
    }

    @Test
    public void filterNegativeNumbers() {
        List<Integer> input = List.of(1, 2, -3, 4, 5, 6, -7, 8, 9, -10);
        List<Integer> result = streamsUeben.filterNegativeZahlen(input);
        List<Integer> expected = List.of(1, 2, 4, 5, 6, 8, 9);
        assertEquals(expected, result);
    }

    @Test
    public void filterNegativeNumbersNoNegativ() {
        List<Integer> input = List.of(0, 1, 2, 4, 5, 6, 8, 9);
        List<Integer> result = streamsUeben.filterNegativeZahlen(input);
        assertEquals(input, result);
    }

}