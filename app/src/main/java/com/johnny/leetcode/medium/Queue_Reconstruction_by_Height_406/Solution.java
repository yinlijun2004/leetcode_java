package com.johnny.leetcode.medium.Queue_Reconstruction_by_Height_406;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/6.
 */
//https://leetcode.com/problems/queue-reconstruction-by-height/#/description

public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        if(people == null ||  people.length == 0 || people[0].length == 0) {
            return new int[0][0];
        }
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if(b[0] == a[0]) {
                    return a[1] - b[1];
                }
                return b[0] - a[0];
            }
        });
        int n = people.length;
        ArrayList<int[]> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(people[i][1], new int[]{people[i][0], people[i][1]});
        }
        int[][] result = new int[people.length][2];
        int i = 0;
        for(int[] k : list) {
            result[i][0] = k[0];
            result[i][1] = k[1];
            i++;
        }


        return result;
    }
}
