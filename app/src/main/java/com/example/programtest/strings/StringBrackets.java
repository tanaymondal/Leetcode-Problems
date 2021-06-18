package com.example.programtest.strings;

import java.util.HashSet;
import java.util.Stack;

public class StringBrackets {

    public static void main(String[] args) {

        System.out.println(solution("({[()]})"));
    }

    static boolean solution(String data){


        Stack<Character> stack = new Stack<>();

        char[] chars = data.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '{' || chars[i] == '['){
                stack.push(chars[i]);
            }


            if (stack.isEmpty()){
                return false;
            }

            char c;
            switch (chars[i]) {
                case ')':
                    c = stack.pop();
                    if (c == '{' || c == '[') {
                        return false;
                    }

                    break;
                case '}':
                    c = stack.pop();
                    if (c == '(' || c == '[') {
                        return false;
                    }
                    break;
                case ']':
                    c = stack.pop();
                    if (c == '{' || c == '(') {
                        return false;
                    }
                    break;
            }
        }

        return stack.isEmpty();
    }
}
