package com.johnny.leetcode.easy.Student_Attendance_Record_I_551;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/4/17.
 */
//https://leetcode.com/problems/student-attendance-record-i/#/description

public class Solution {
    public boolean checkRecord(String s) {
        s = s.toUpperCase();
        int i = s.indexOf('A');
        return !(s.contains("LLL") || s.indexOf('A', i + 1) > 0);
    }
}
