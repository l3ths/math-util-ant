/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.ghostart.mathutil.main;

import com.ghostart.mathutil.core.MathUtil;

/**
 *
 * @author thanhhuy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean expectedValue;
        boolean actualValue;
        int n;
        //Test Case 1: n = 1, expected == isPrime == false
        n=1;
        expectedValue = false;
        actualValue = MathUtil.isPrime(n);
        System.out.println("Test "+n+" is prime : expected = "+expectedValue+" | actual = "+actualValue);
        //Test Case 2: n = 2, expected == isPrime == true
        n=2;
        expectedValue = true;
        actualValue = MathUtil.isPrime(n);
        System.out.println("Test "+n+" is prime : expected = "+expectedValue+" | actual = "+actualValue);
        //Test Case 3: n = 3, expected == isPrime == true
        n=3;
        expectedValue = true;
        actualValue = MathUtil.isPrime(n);
        System.out.println("Test "+n+" is prime : expected = "+expectedValue+" | actual = "+actualValue);
        //Test Case 4: n = 4, expected == isPrime == true
        n=4;
        expectedValue = false;
        actualValue = MathUtil.isPrime(n);
        System.out.println("Test "+n+" is prime : expected = "+expectedValue+" | actual = "+actualValue);
        //Test Case 5: n = 128, expected : See Illegal Argument Exception!
        n=128;
        System.out.println("See Illegal Argument Exception!");
        MathUtil.isPrime(n);
        
    }
    
}
