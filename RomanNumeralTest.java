/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.romannumeral;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author flyin
 */
public class RomanNumeralTest {

    RomanNumeral romanNumeral = new RomanNumeral();

    @Test
    public void testSingleLetters() {
        assertEquals(1, romanNumeral.romanToInt("I"));
        assertEquals(5, romanNumeral.romanToInt("V"));
        assertEquals(10, romanNumeral.romanToInt("X"));
        assertEquals(50, romanNumeral.romanToInt("L"));
        assertEquals(100, romanNumeral.romanToInt("C"));
        assertEquals(500, romanNumeral.romanToInt("D"));
        assertEquals(1000, romanNumeral.romanToInt("M"));
    }

    @Test
    public void testManyLetters() {
        assertEquals(11, romanNumeral.romanToInt("XI"));
    }

    @Test
    public void testSubtractiveNotation() {
        assertEquals(4, romanNumeral.romanToInt("IV"));
    }

    @Test
    public void testWithAndWithoutSubtractiveNotation() {
        assertEquals(14, romanNumeral.romanToInt("XIV"));
    }

    @Test
    public void testRepetition() {
        assertEquals(2, romanNumeral.romanToInt("II"));
    }

    @Test
    public void testFirstNumber() {
        assertEquals(1, romanNumeral.romanToInt("I"));
    }

    @Test
    public void testInvalidLetter() {
        assertEquals(-1, romanNumeral.romanToInt("Z"));
    }

    @Test
    public void testInvalidAndValidLetter() {
        assertEquals(-1, romanNumeral.romanToInt("XIZ"));
    }

    @Test
    public void testNotValid() {
        assertEquals(-1, romanNumeral.romanToInt("VV"));
    }

    @Test
    public void testNull() {
        assertEquals(-1, romanNumeral.romanToInt(null));
    }

}
