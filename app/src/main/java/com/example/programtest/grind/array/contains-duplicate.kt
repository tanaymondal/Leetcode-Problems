package com.example.programtest.grind.array

import java.util.Arrays

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//Example 1:
//Input: nums = [1,2,3,1]
//Output: true
//
//Example 2:
//Input: nums = [1,2,3,4]
//Output: false
//
//Example 3:
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true

// https://leetcode.com/problems/contains-duplicate/description/

fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    println(isContainsDuplicate1(nums))
    println(isContainsDuplicate2(nums))
}

fun isContainsDuplicate1(nums: IntArray): Boolean {
    Arrays.sort(nums)
    var value = nums[0]
    for (i in 1 until nums.size) {
        if (nums[i] == value) {
            return true
        }
        value = nums[i]
    }
    return false
}

fun isContainsDuplicate2(nums: IntArray): Boolean {
    val mSet = HashSet<Int>()

    for (i in 0 until nums.size) {
        if (mSet.contains(nums[i])) {
            return true
        }
        mSet.add(nums[i])
    }
    return false
}