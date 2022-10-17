/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.ghostart.mathutil.core;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author thanhhuy
 */
public class MathUtilTest {
    
    public MathUtilTest() {
    }

    @Test
    //test case 1: n = 1, expected  = false 
    //test case 2: n = 2, expected  = true
    //test case 3: n = 3, expected  = true
    //test case 4: n = 4, expected  = false
    public void testPrimeGivenRightArgumentReturnsWell() {
        boolean expected = false;
        boolean actual = MathUtil.isPrime(1);
        Assert.assertEquals(actual, expected);
        Assert.assertEquals(MathUtil.isPrime(2), true);
        Assert.assertEquals(MathUtil.isPrime(3), true);
        Assert.assertEquals(MathUtil.isPrime(4), false);
    }


//    @Ignore
    @Test(expectedExceptions = IllegalArgumentException.class)
    //test case 5: n = -5, expected : hi vong thay ngoai le duoc nem ra
    public void testPrimeGivenWrongArgumentThrowsException() {
        MathUtil.isPrime(-5);
    }
}
