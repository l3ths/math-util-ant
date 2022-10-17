/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.ghostart.mathutil.core;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author thanhhuy
 */
public class MathUtilDependencyTest {
    
    public MathUtilDependencyTest() {
    }
    
    @Test
    public void testDependency1(){
        Assert.assertEquals(MathUtil.isPrime(8), true);
        
    }
    
    @Test
    public void testDependency2(){
        Assert.assertEquals(MathUtil.isPrime(7), true);
    }
    
    @Test(dependsOnMethods = {"testDependency2"})
    public void testDependency3(){
        Assert.assertEquals(MathUtil.isPrime(7), true);
    }
    
}
