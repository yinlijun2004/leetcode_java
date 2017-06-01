package com.johnny.leetcode.medium.Insert_Delete_GetRandom_O_1_380;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/6/1.
 */

public class Solution {
    /**
     * 题目要求所有的操作都是O(1)的时间复杂度，所以需要用一个HashMap保存每次插入的索引。
     * 删除元素时，用ArrayList末尾的元素替换删除的元素，并更新HashMap中的索引。
     */
    public class RandomizedSet {
        private HashMap<Integer, Integer> map;
        private ArrayList<Integer> list;
        /** Initialize your data structure here. */
        public RandomizedSet() {
            map = new HashMap<Integer, Integer>();
            list = new ArrayList<Integer>();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if(map.containsKey(val)) {
                return false;
            }
            list.add(val);
            int i = list.size() - 1;
            map.put(val, i);

            return true;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if(!map.containsKey(val)) {
                return false;
            }
            int i = map.get(val);
            map.remove(val);
            int last = list.size() - 1;
            int lastVal = list.get(last);
            if(lastVal != val) {
                map.put(list.get(last), i);
            }
            list.set(i, list.get(last));
            list.remove(last);
            return true;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            int i = (int)(list.size() * Math.random());
            return list.get(i);
        }
    }
}
