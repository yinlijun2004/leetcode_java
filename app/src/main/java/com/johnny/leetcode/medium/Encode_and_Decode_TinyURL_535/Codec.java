package com.johnny.leetcode.medium.Encode_and_Decode_TinyURL_535;

import java.util.HashMap;

/**
 * brief:
 * author: yinlijun
 * email: yinlijun2004 at gmail dot com
 * date: 2017/5/11.
 */

public class Codec {
    private static HashMap<String, String> map = new HashMap<String, String>();

    public static String md5(String str){
        char[] cs = str.toCharArray();
        byte[] digest = new byte[6];
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < cs.length; j++) {
                digest[i] += ((255 - i) * cs[j]);
            }
        }

        return new String(digest);
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl = md5(longUrl);
        map.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
