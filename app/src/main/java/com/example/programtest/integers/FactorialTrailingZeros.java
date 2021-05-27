package com.example.programtest.integers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FactorialTrailingZeros {
    // Find number of Trailing Zeros in factorial
    // 5! = 120, so trailing zero's count is 1
    // Just have to count how many number of 5 multiplies are there on factorial
    // 5! = 1 * 2 * 3 * 4 * '5' = 120
    // 10! = 1 * 2 * 3 * 4 * '5' * 6 * 7 * 8 * 9 * '10' = 3628800
    // ==> Two 5 available.

    public static void main(String[] args) {
        System.out.println("Number of Trailing Zeros: " + solution(10));

        System.out.println(factorial(10));

        int[] collection = new int[] {1, 5, 1, 4, 10, 2};

        int[] sums = twoSum(collection, 12);
        System.out.println(Arrays.toString(sums));
    }

    public static int solution(int number) {
        int count = 0;
        while (number > 0) {
            number = number / 5;
            count = count + number;
        }
        return count;
    }

    public static long factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (map.containsKey(complement)) {
                return new int[]{ map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Not found");

    }
}
