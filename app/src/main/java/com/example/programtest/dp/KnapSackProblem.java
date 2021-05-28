package com.example.programtest.dp;

public class KnapSackProblem {
    // 0 1 KnapSack problem
    private static int[][] dp;

    public static void main(String[] args) {
        int[] wt = new int[]{ 10, 20, 30, 40, 50 };
        int[] val = new int[]{ 2, 3, 5, 4, 7 };
        int W = 100; // max capacity
        int n = val.length;

        dp = new int[n + 1][W + 1];

        System.out.println(knapSack(W, wt, val, n));
    }

    static int knapSackRecursion(int W, int[] wt, int[] val, int n) {

        if (n == 0 || W == 0) {
            return 0;
        }

        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        if (wt[n - 1] > W) {
            // don't add it on knapsack
            return dp[n][W] = knapSackRecursion(W, wt, val, n - 1);
        } else {
            return dp[n][W] = max(val[n - 1] + knapSackRecursion(W - wt[n - 1], wt, val, n - 1),
                    knapSackRecursion(W, wt, val, n - 1));
        }
    }

    static int knapSack(int W, int[] wt, int[] val, int n) {


        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < W + 1; j++) {
                dp[i][j] = -1;
            }
        }

        return knapSackRecursion(W, wt, val, n);
    }


    static int max(int a, int b) {
        return Math.max(a, b);
    }
}
