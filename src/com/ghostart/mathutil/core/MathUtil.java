/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ghostart.mathutil.core;

import static java.lang.Math.sqrt;

/**
 *
 * @author thanhhuy
 */
public class MathUtil {

    public static boolean isPrime(int n) {
        if (n < 0 || n > 127) {
            throw new IllegalArgumentException("invalid argument. n must be between -128..127");
        }
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
