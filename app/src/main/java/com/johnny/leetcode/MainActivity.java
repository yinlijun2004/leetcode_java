package com.johnny.leetcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        com.johnny.leetcode.easy.Number_of_Boomerangs_447.Solution solution = new com.johnny.leetcode.easy.Number_of_Boomerangs_447.Solution();
        int num = solution.numberOfBoomerangs(new int[][]{{0,0},{1,0},{2,0},{4,4},{5,4},{6,4}});
        Log.d("&&&", String.valueOf(num));
    }
}
