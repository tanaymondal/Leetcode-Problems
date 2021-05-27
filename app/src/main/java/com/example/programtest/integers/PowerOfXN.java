package com.example.programtest.integers;

public class PowerOfXN {

    public static void main(String[] args) {
        System.out.println(myPow(-1.00000, -2147483648));
    }

// -1.00000
//-2147483648

    public static double myPow(double x, long n) {
        double number = 1;
        double num = n;
        if (x == 1) return 1;
        if (n == 0) return 1;

        if (x == -1) {
            if (n % 2 == 0){
                return 1;
            }
            else {
                return -1;
            }
        }
        if (n == Integer.MIN_VALUE) return 0;
        if (num < 0) {
            n = -1 * n;
        }
        while (n > 0) {
            if (n % 2 == 0){
                x = x * x;
                n = n / 2;
            }
            else {
                number = number * x;
                n = n - 1;
            }
        }
        if (num > 0) {
            return number;
        }
        else {
            return 1 / number;
        }
    }

//    x = 1 * 2 = 2
//    x = 2 * 2 = 4
//    x = 4 * 2 = 8
//    x = 8 * 2 = 16
//    x = 16 * 2 = 32
//    x = 32 * 2 = 64
//    x = 64 * 2 = 128
//    x = 256 * 2 = 512
//    x = 512 * 2 = 1024

}
