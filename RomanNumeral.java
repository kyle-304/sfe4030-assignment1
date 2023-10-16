package com.mycompany.romannumeral;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeral {

    private static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        if (s == null || s.isEmpty()) {
            return -1;  // Return -1 for null or empty input.
        }

        int convertedNumber = 0;
        int prevNumber = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentNumber = map.get(s.charAt(i));

            if (currentNumber == null) {
                return -1;  // Return -1 for invalid input characters.
            }

            if (currentNumber < prevNumber) {
                convertedNumber -= currentNumber;
            } else {
                convertedNumber += currentNumber;
            }

            prevNumber = currentNumber;
        }

        return convertedNumber;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        RomanNumeral xy = new RomanNumeral();

        String str = "MCMIV";
        System.out.println(xy.romanToInt(str));

    }
}
