package com.three.test;

import org.junit.Test;

public class ThreeFiveTest01 {

    private static final String buzz = "Buzz";
    private static final String fizz = "Fizz";
    private static final String fizzBuzz = "FizzBuzz";

    @Test
    public void miniCodingTest01(){
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(fizzBuzz + ": " + i);
                continue;
            }
            if (i % 3 == 0) {
                System.out.println(fizz + ": " + i);
                continue;
            }
            if (i % 5 == 0) {
                System.out.println(buzz + ": " + i);
                continue;
            }
            System.out.println(i);
        }
    }

    @Test
    public void miniCodingTest02(){
        for (Integer i = 1; i <= 100; i++) {
            //a number is fizzBuzz if it is divisible by 3 and 5 and it contains 3 "or" 5
            if (i % 3 == 0 && i % 5 == 0
                    && (i.toString().contains("3") || i.toString().contains("5"))) {
                System.out.println(fizzBuzz + ": " + i);
                continue;
            }
            //a number is fizz if it is divisible by 3 "or" it contains 3
            if (i % 3 == 0 || i.toString().contains("3")) {
                System.out.println(fizz + ": " + i);
                continue;
            }
            //a number is buzz if it is divisible by 5 "or" it contains 5
            if (i % 5 == 0 || i.toString().contains("5")) {
                System.out.println(buzz + ": " + i);
                continue;
            }
            System.out.println(i);
        }
    }

}
