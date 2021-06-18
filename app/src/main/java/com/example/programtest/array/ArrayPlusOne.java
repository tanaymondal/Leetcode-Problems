package com.example.programtest.array;

public class ArrayPlusOne {

    // suppose array = {9, 9 ,9}
    // return 999 + 1 = 1000;


    public static void main(String[] args) {
        int[] array = {1, 4, 3};

        System.out.println(solution(array));
    }

    // [1, 2, 0]
    static int solution2(int[] array) {
        int carry = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] + 1 >= 10) {
                array[i] = 0;
                carry = 1;
            } else {
                array[i] = array[i] + 1;
                carry = 0;
            }
        }
        int[] arr;
        if (carry == 1) {
            arr = new int[array.length + 1];
            for (int i = 0; i < arr.length; i++) {
                if (i == 0) {
                    arr[i] = 1;
                }
                else {
                    arr[i] = array[i - 1];
                }
            }
            array = arr;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return sum;
    }

    static int solution(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + (array[i] * getMul(array.length - (i + 1)));
        }

        return sum + 1;
    }

    static int getMul(int i) {
        if (i == 0) {
            return 1;
        }

        StringBuilder mul = new StringBuilder("1");

        for (int j = 1; j <= i; j++) {
            mul.append("0");
        }

        return Integer.parseInt(mul.toString());

    }

}
