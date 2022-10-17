/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.ghostart.mathutil.core;

import static com.ghostart.mathutil.core.MathUtil.isPrime;
import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 *
 * @author thanhhuy
 */
public class MathUtilDDTTest {

    public MathUtilDDTTest() {
    }

    @DataProvider(name = "testPrime")
    public static String[][] initData() {

        return new String[][]{
            {"0", "false"}, {"1", "false"}, {"2", "true"}, {"3", "true"}, {"4", "false"}, {"5", "true"}, {"6", "false"}
        };
    }

    @Test(dataProvider = "testPrime") //xai data tu 2 bien tren     
    public void testPrimeGivenRightArgumentReturnsWell(String n, String expected) {
        assertEquals(isPrime(Integer.parseInt(n)), Boolean.parseBoolean(expected));
    }
}
