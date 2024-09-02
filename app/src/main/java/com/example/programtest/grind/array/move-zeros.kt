package com.example.programtest.grind.array

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.
//Example 1:
//
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Example 2:
//
//Input: nums = [0]
//Output: [0]

//https://leetcode.com/problems/move-zeroes/description/

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)

    println(moveZero(nums).contentToString())
    println(moveZero1(nums).contentToString())
}

fun moveZero(nums: IntArray): IntArray {
    var left = 0

    for (right in 0 until nums.size) {
        if (nums[right] != 0) {
            val temp = nums[right]
            nums[right] = nums[left]
            nums[left] = temp
            left++
        }
    }
    return nums
}

fun moveZero1(nums: IntArray): IntArray {
    var a = 0
    for (i in 0 until nums.size) {
        if (nums[i] != 0) {
            nums[a] = nums[i]
            a++
        }
    }

    for (i in a until nums.size) {
        nums[i] = 0
    }
    return nums
}