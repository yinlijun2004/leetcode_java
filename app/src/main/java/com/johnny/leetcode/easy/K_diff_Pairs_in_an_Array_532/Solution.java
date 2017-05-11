package com.johnny.leetcode.easy.K_diff_Pairs_in_an_Array_532;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */
//https://leetcode.com/problems/k-diff-pairs-in-an-array/#/description

public class Solution {
    //solution 3
    /**
     * 先去重，如果k是0，则找到重复数字的个数
     * 否则，对map遍历，判断i对应的key和i + k对应的key是否同时存在。
     */
    public int findPairs(int[] nums, int k) {
        if(nums == null || nums.length < 2 || k < 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = 0;
        for(int i : nums) {
            //n = map.getOrDefault(i, 0);
            n = 0;
            if(map.containsKey(i)) {
                n = map.get(i);
            }
            if(n < 2) {
                map.put(i, n + 1);
            }
        }

        int ret = 0;
        Set<Integer> set = map.keySet();
        if(k == 0) {
            for(int i : set) {
                if(map.get(i) > 1) {
                    ++ret;
                }
            }
        } else {
            for(int i : set) {
                if(map.containsKey(i + k)) {
                    ++ret;
                }
            }
        }
        return ret;
    }
    //solution 2
    /**
     * 如果k是0，只需要找到有重合数字的个数。
     * 如果k非零，则先去重，然后再排序，对排序数组遍历，来个二分查找。
     */
    /*
    public int findPairs(int[] nums, int k) {
        if(k == 0) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            int n;
            for(int i : nums) {
                //n = map.getOrDefault(i, 0);
                n = 0;
                if(map.containsKey(i)) {
                    n = map.get(i);
                }
                if(n < 2) {
                    map.put(i, n + 1);
                }
            }
            int ret = 0;
            Set<Integer> set = map.keySet();
            for(int i : set) {
                if(map.get(i) > 1) {
                    ++ret;
                }
            }
            return ret;
        }
        Set<Integer> set = new HashSet<Integer>();
        for(int i : nums) {
            set.add(i);
        }
        int ret = 0;
        Integer[] arr = new Integer[set.size()];
        set.toArray(arr);
        Arrays.sort(arr);
        //原题不考虑k小于0的情况
        //k = Math.abs(k);
        for(int i = 0; i < arr.length - 1; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            int mid = 0;
            while(left <= right) {
                mid = (left + right) / 2;
                int result = Math.abs(arr[i] - arr[mid]);
                if(result == k) {
                    ++ret;
                    break;
                } else if(result > k) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return ret;
    }
    */
    /**  solution 1
     */
    /*
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int ret = 0;
        for(int i = 0, j = 1; i < nums.length && j < nums.length; ) {

            if(nums[j] - nums[i] == k) {
                ret++;
                while(++j < nums.length && nums[j] == nums[j - 1]);
            } else if(nums[j] - nums [i] < k) {
                j++;
            } else {
                while(++i < nums.length && nums[i] == nums[i - 1]);
                System.out.println("i:" + i + "j:" +j);
                j = i + 1;
            }
        }
        return ret;
    }
    */
}