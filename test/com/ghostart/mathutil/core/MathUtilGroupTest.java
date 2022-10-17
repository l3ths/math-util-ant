/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.ghostart.mathutil.core;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

/**
 *
 * @author thanhhuy
 */
public class MathUtilGroupTest {
    
    public MathUtilGroupTest() {
    }
    @Ignore
    @Test(groups = { "testwillrun", "testwillnotrun" })

   public void testGroupRun() {
      Assert.assertEquals(MathUtil.isPrime(7), true);
   }
   @Ignore
   @Test(groups = { "testwillnotrun" })

   public void testGroupNotRun() {
      Assert.assertEquals(MathUtil.isPrime(10), false);
   }
   @Ignore
   @Test(groups = { "testwillrun" })

   public void testGroupRun2() {
      Assert.assertEquals(MathUtil.isPrime(11), true);
   }
}
