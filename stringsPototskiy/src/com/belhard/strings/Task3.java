package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.belhard.util.Util;

public class Task3 {

    public static void main(String[] args) {
        String[] str = addString();
        Util.display(str);
        solve(str);
    }

    public static void solve(String[] str) {
        Pattern pattern = Pattern.compile("\\d");
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            Matcher matcher = pattern.matcher(str[i]);
            while (matcher.find()) {
                count++;
            }
            System.out.println("Size: " + count);
        }
    }

    public static String[] addString() {
        String[] newStr = new String[5];
        newStr[0] = "125 1235  1";
        newStr[1] = "-1235 53 -35";
        newStr[2] = "1235 15325";
        newStr[3] = "35 3258230 5";
        newStr[4] = " 123 123 25";
        return newStr;
    }
}
