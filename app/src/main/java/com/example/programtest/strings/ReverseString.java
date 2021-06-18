package com.example.programtest.strings;

public class ReverseString {


    public static void main(String[] args) {
        System.out.println(solution("What's up man?"));
        System.out.println(solution("Hello World"));
    }

    static char[] solution(String string) {

        char[] array = string.toCharArray();


        int left = 0;
        int right = array.length - 1;

        while (left < right){

            char temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
        return array;
    }
}
