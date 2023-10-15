package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.belhard.util.Util;

public class Task7 {

    public static void main(String[] args) {
        String[] str = addString();
        Util.display(str);
        str = solve(str);
        Util.display(str);
    }

    public static String[] solve(String[] str) {
        Pattern pattern = Pattern.compile("a");

        for (int i = 0; i < str.length; i++) {
            Matcher matcher = pattern.matcher(str[i]);

            StringBuilder strb = new StringBuilder();
            while (matcher.find()) {
                matcher.appendReplacement(strb, "ab");
            }
            matcher.appendTail(strb);

            str[i] = strb.toString();
        }
        return str;
    }

    public static String[] addString() {
        String[] newStr = new String[5];
        newStr[0] = "aa aaaa Task ask kkakkaa";
        newStr[1] = "pasfpa asaa aas asfu";
        newStr[2] = "aasdas ouads oausd ogaspa";
        newStr[3] = "aaausdg aysdoiasyiasa";
        newStr[4] = "aauaya uau auayayayayaa";
        return newStr;

    }

}
