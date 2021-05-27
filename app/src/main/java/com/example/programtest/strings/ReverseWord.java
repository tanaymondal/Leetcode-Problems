package com.example.programtest.strings;

public class ReverseWord {

    public static void main(String[] args) {
        System.out.println(solution("What's up man?"));
        System.out.println(solution("I am   fine"));
    }

    static String solution(String word) {
        StringBuilder sb = new StringBuilder();

        int i = word.length() - 1;

        while (i >= 0) {
            if (word.charAt(i) == ' ') {
                i--;
            } else {
                int j = i;
                while (i >= 0 && word.charAt(i) != ' ') {
                    i--;
                }
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                for (int k = i + 1; k <= j; k++) {
                    sb.append(word.charAt(k));
                }
            }
        }

        return sb.toString().trim();
    }
}
