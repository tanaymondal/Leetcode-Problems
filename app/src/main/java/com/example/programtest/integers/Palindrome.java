package com.example.programtest.integers;

public class Palindrome {
    public static void main(String[] args) {
        // Check given number palindrome or not
        System.out.println("Is Palindrome " + isPalindrome(12121));
        System.out.println("Is Palindrome " + isPalindrome(1212826721));
    }

    static boolean isPalindrome(int number) {

        if (number < 0 || (number % 10 == 0 && number != 0)) {
            return false;
        }

        int reversedNum = 0;
        while (number > reversedNum) {
            reversedNum = reversedNum * 10 + number % 10;
            number = number / 10;
        }

        System.out.println("->" + number + " ->" + reversedNum);

        return reversedNum == number || number == reversedNum / 10;
    }
}
