package com.example.programtest.strings;

import java.util.Arrays;

public class Anagrams {


    public static void main(String[] args) {
        System.out.println(solution("abc", "ccc"));
    }

    public static boolean solution(String one, String two) {
        if (one.length() != two.length()){
            return false;
        }

        char[] first = one.toCharArray();
        char[] second = two.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]){
                return false;
            }
        }

        return true;
    }

}
