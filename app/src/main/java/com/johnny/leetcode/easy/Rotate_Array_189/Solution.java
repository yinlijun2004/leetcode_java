package com.johnny.leetcode.easy.Rotate_Array_189;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */
//https://leetcode.com/problems/rotate-array/#/description

public class Solution {
    /**
     * solution 1
     * 暴力解法，毫不意外超时了，时间复杂度，O(N^2) 空间复杂度O(1)
     */
    /*
    private void shiftLeftOnce(int[] nums) {
        int len = nums.length;
        int ret = nums[len - 1];
        for(int i = len - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = ret;
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        if(k == 0) {
            return;
        }
        while(k-- > 0) {
            shiftLeftOnce(nums);
        }
    }
    */

    /**
     * solution2
     * 数组拷贝，时间复杂度，O(1)，空间复杂度O(N)
     * @param nums
     * @param left
     * @param right
     */
    /*
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] arr = new int[len];
        k = k % len;
        if(k == 0) {
            return;
        }

        System.arraycopy(nums, len - k, arr, 0, k);
        System.arraycopy(nums, 0, arr, k, len - k);
        System.arraycopy(arr, 0, nums, 0, len);
    }

    private void printNums(int[] nums) {
        for(int i : nums) {
            System.out.print(i);
        }
        System.out.println();
    }
    */

    /**
     * solution 3
     * 时间复杂度O(N),空间复杂度O(1)
     * @param nums
     * @param left
     * @param right
     */
    private void reverse(int[] nums, int left, int right) {
        while(left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            ++left;
            --right;
        }
    }

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        if(k == 0) {
            return;
        }
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

}