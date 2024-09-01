package com.example.programtest.grind.array

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)

    var buy = prices[0]
    var profit = 0

    for (i in 1 until prices.size) {
        if (prices[i] < buy) {
            buy = prices[i]
        } else if (prices[i] - buy > profit) {
            profit = prices[i] - buy
        }
    }

    print(profit)

}