package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.belhard.util.Util;

public class Task5 {

    public static void main(String[] args) {
        String[] str = addString();
        Util.display(str);
        str = solve(str);
        Util.display(str);
    }

    public static String[] solve(String[] str) {
        Pattern pattern = Pattern.compile("\\p{Blank}{2,}");
        for (int i = 0; i < str.length; i++) {
            Matcher matcher = pattern.matcher(str[i]);
            str[i] = matcher.replaceAll(" ");
            str[i] = str[i].strip();
        }
        return str;
    }

    public static String[] addString() {
        String[] newStr = new String[5];
        newStr[0] = "The      lazy     brown fox jumps over      the quick dog.";
        newStr[1] = "     She     likes to     eat ice cream after dinner.";
        newStr[2] = "    The      students enjoyed the      outdoor picnic on      a sunny day.";
        newStr[3] = "He took      a long                 walk in the   beautiful   autumn forest.    ";
        newStr[4] = "      The old bookstore has a      unique charm with its    wooden bookshelves.";
        return newStr;
    }

}
