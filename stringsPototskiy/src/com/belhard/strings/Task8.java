package com.belhard.strings;

import com.belhard.util.Util;

public class Task8 {

    public static void main(String[] args) {
        String[] str = addString();
        Util.display(str);
        palindrome(str);
    }

    public static void palindrome(String[] str) {
        for (int i = 0; i < str.length; i++) {
            String revers = new StringBuilder(str[i]).reverse().toString();
            System.out.println(str[i].equalsIgnoreCase(revers));
        }
    }

    public static String[] addString() {
        String[] newStr = new String[5];
        newStr[0] = "radar";
        newStr[1] = "level";
        newStr[2] = "civik";
        newStr[3] = "deified";
        newStr[4] = "rotator";
        return newStr;
    }

}
