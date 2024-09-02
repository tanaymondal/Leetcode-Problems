package com.example.programtest.grind.array

import java.util.Arrays

//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2

// https://leetcode.com/problems/majority-element/description/

fun main() {
    val array = intArrayOf(2, 2, 1, 1, 1, 2, 2, 1, 1)
    println(getMajorityElement1(array))
    println(getMajorityElement2(array))
}

fun getMajorityElement1(array: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    var majorityElement = array[0]

    for (data in array) {
        if (map.containsKey(data)) {
            map.put(data, map.getValue(data) + 1)
        } else {
            map.put(data, 1)
        }
    }

    for (data in map) {
        if (data.value > array.size / 2) {
            majorityElement = data.key
            break
        }
    }
    return majorityElement
}

fun getMajorityElement2(intArray: IntArray): Int {
    Arrays.sort(intArray)
    return intArray[(intArray.size / 2)]
}
