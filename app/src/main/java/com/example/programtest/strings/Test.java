package com.example.programtest.strings;

import java.util.HashMap;

public class Test {




    public static void main(String[] args) {
        String[] name = {"Tanay", "Sir", "Mondal"};

        int y = 2;
        int x = 0;

        solution(name);

        System.out.println(y / x);
    }

    static void solution(String[] name) {

        HashMap<Integer, char[]> map = new HashMap();

        int maxLength = 0;

        for (int m = 0; m < name.length; m++) {

            if (name[m].length() > maxLength) {
                maxLength = name[m].length();
            }
            map.put(m, name[m].toCharArray());
        }

        for (int i = 0; i < maxLength; i++) {

            for (int j = 0; j < name.length; j++) {

                if (map.get(j).length > i) {
                    System.out.print(map.get(j)[i]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
