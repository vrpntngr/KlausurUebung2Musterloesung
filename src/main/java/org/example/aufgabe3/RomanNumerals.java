package org.example.aufgabe3;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

    Map<Integer, String> dezimalToRomanMap = new LinkedHashMap<>();

    public RomanNumerals() {
        dezimalToRomanMap.put(100, "C");
        dezimalToRomanMap.put(90, "XC");
        dezimalToRomanMap.put(50, "L");
        dezimalToRomanMap.put(10, "X");
        dezimalToRomanMap.put(9, "IX");
        dezimalToRomanMap.put(5, "V");
        dezimalToRomanMap.put(4, "IV");
        dezimalToRomanMap.put(1, "I");
    }

    public String convert(int dezimalZahl) {
        StringBuilder builder = new StringBuilder();

        for (Map.Entry<Integer, String> entry : dezimalToRomanMap.entrySet()) {
            while (dezimalZahl >= entry.getKey()) {
                builder.append(entry.getValue());
                dezimalZahl -= entry.getKey();
            }
        }
        return builder.toString();
    }
}
