package com.example.programtest.integers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FizzBuzz {

    // Write a program that prints the numbers from 1 to 100
    // and for multiples of ‘3’ print “Fizz” instead of the number
    // and for the multiples of ‘5’ print “Buzz”.
    // and for the multiples of ‘5’ and ‘3’ print “FizzBuzz”.

    public static void main(String[] args){

        List<String> list = solution();
        System.out.println(list);

    }

    private static List<String> solution() {
        ;
        List<String> array = new ArrayList<>();
        // first solution
/*        for (int i = 1; i <= 100 ; i++) {
            if (i % 15 == 0){
                array.add("FizzBuzz");
            }
            else if (i % 3 == 0){
                array.add("Fizz");
            }
            else if (i % 5 == 0) {
                array.add("Buzz");
            }
            else {
                array.add(String.valueOf(i));
            }
        }*/

        // 2nd solution
        for (int i = 1, fizz = 0, buzz = 0; i <= 15; i++) {
            fizz++;
            buzz++;
            if (fizz == 3 && buzz == 5){
                array.add("FizzBuzz");
                fizz = 0;
                buzz = 0;
            }
            else if (fizz == 3) {
                array.add("Fizz");
                fizz = 0;
            }
            else if (buzz == 5) {
                array.add("Buzz");
                buzz = 0;
            }
            else {
                array.add(String.valueOf(i));
            }
        }
        return array;
    }

}
