package com.example.programtest.grind.array

// https://leetcode.com/problems/two-sum/description/
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
fun main() {
    val nums = intArrayOf(5,5,7,3)
    val target = 10
    val output = twoSum(nums, target)
    println(output.contentToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray? {
    val map = mutableMapOf<Int, Int>()

    for ((i, data) in nums.withIndex()) {
        val difference = target - data
        if (map.contains(difference) && difference != data) {
            val index = map[difference]
            return intArrayOf(index!!, i)
        }
        map[data] = i
    }
    return null
}

// Test
fun twoSum2(nums: IntArray, target: Int): IntArray? {

    for ((i, data) in nums.withIndex()) {
        val difference = target - data
        if (nums.indexOf(difference) != -1 && difference != data) {
            return intArrayOf(nums.indexOf(difference), i)
        }
    }
    return null
}