package com.example.programtest.dp;

public class KnapSackProblem {
    // 0 1 KnapSack problem


    public static void main(String[] args) {
        int[] wt = new int[]{2, 4, 6, 7};
        int[] val = new int[]{5, 6, 7, 8};
        int W = 10; // max capacity
        int n = val.length;

        System.out.println(knapSack(W, wt, val, n));
    }

    static int knapSack(int W, int[] wt, int[] val, int n) {

        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n - 1] > W) {
            // don't add it on knapsack
            return knapSack(W, wt, val, n - 1);
        } else {
            return max(val[n - 1] + knapSack(W - wt[n - 1], wt, val, n - 1),
                    knapSack(W, wt, val, n - 1));
        }
    }

    static int max(int a, int b) {
        return Math.max(a, b);
    }
}
