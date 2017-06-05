package com.johnny.leetcode.medium.Kill_Process_582;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by 莉军 on 2017/6/4.
 */

public class Solution {
    private void addChild(HashMap<Integer, ArrayList<Integer>> map, int pp, int p) {
        if(map.containsKey(pp)) {
            map.get(pp).add(p);
        } else {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(p);
            map.put(pp, list);
        }
    }
    private void travelMap(int kill, List<Integer> result, HashMap<Integer, ArrayList<Integer>> map) {
        result.add(kill);
        ArrayList<Integer> list = map.get(kill);
        if(list == null) {
            return;
        }
        for(int id : list) {
            travelMap(id, result, map);
        }
    }

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

        for(int i = 0; i < ppid.size(); i++) {
            addChild(map, ppid.get(i), pid.get(i));
        }
        List<Integer> result = new ArrayList<Integer>();
        travelMap(kill, result, map);
        return result;
    }
}

