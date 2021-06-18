package com.example.programtest.strings;

public class StringPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("KayaK"));
    }


    public static boolean isPalindrome(String data) {

        char[] string = data.toCharArray();
        StringBuilder sb = new StringBuilder(data);
        char[] mData = sb.reverse().toString().toCharArray();

        for (int i = 0; i < string.length; i++) {
            if (string[i] != mData[i]){
                return false;
            }
        }

        return true;
    }
}
