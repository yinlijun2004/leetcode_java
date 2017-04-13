package com.johnny.leetcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    final double[] times = new double[] {
            6.369,
            6.409,
            6.723,
            6.857,
            7.033,
            7.145,
            7.188,
            7.214,
            7.244,
            7.458,
            7.520,
            7.628,
            7.673,
            7.865,
            7.896,
            8.319,
            8.423,
            8.483,
            8.523,
            8.848,
            8.887,
            9.203,
            9.246,
            9.394,
            9.472,
            9.669,
            9.692,
            9.932,
            10.019,
            10.222,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        double spt = 0;
        double apt = 0;
        for(int i = 1; i < times.length; i++) {
            double t = times[i] - times[i - 1];
            if(i % 2 == 0) {
                spt += t;
            } else {
                apt += t;
            }
        }
        Log.d("&&&", "sp time:" + spt + " ap time:" + apt);
    }
}
