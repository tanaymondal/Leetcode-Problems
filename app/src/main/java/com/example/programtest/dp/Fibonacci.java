package com.example.programtest.dp;

public class Fibonacci {

    static int[] fib;


    public static void main(String[] args) {

        int number = 10;

        System.out.println(sol1(number));

        fib = new int[number + 1];

        System.out.println(sol2(number));

        System.out.println(sol3(number));
    }

    // Down Top (Tabulation) : DP with Memoization
    static int sol1(int n) {
        int[] fib = new int[n + 1];
        // base case
        fib[0] = 0;
        fib[1] = 1;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }

    // Top Down (Recursive) : DP with Memoization
    static int sol2(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        if (fib[n] != 0) {
            return fib[n];
        }

        return fib[n] = sol2(n - 2) + sol2(n - 1);
    }

    // temp variable approach
    static int sol3(int n) {

        int first = 0, second = 1;
        int third = 0;

        if (n == 0) {
            return first;
        }
        if (n == 1) {
            return second;
        }

        for (int i = 2; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }

        return third;
    }
}
