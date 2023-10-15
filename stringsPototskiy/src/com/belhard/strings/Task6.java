package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.belhard.util.Util;

public class Task6 {

    public static void main(String[] args) {
        String[] str = addString();
        Util.display(str);
        solve(str);
    }

    public static void solve(String[] str) {
        Pattern pattern = Pattern.compile("\\s+");
        for (int i = 0; i < str.length; i++) {
            Matcher matcher = pattern.matcher(str[i]);
            int maxSpace = 0;
            int space = 0;

            while (matcher.find()) {
                space = matcher.group().length();
                if (maxSpace < space) {
                    maxSpace = space;
                }
            }
            System.out.println("Max spaces: " + maxSpace);
        }
    }

    public static String[] addString() {
        String[] newStr = new String[5];
        newStr[0] = "The      lazy     brown fox jumps       over      the quick dog.";
        newStr[1] = "     She     likes to     eat ice cream after dinner.";
        newStr[2] = "    The      students enjoyed the      outdoor picnic on      a sunny day.";
        newStr[3] = "He took      a long               walk in the   beautiful   autumn forest.    ";
        newStr[4] = "      The old bookstore has a      unique charm with its    wooden bookshelves.";
        return newStr;
    }

}
