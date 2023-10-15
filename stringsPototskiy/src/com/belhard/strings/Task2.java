package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.belhard.util.Util;

public class Task2 {

    public static void main(String[] args) {
        String[] str = addString();
        Util.display(str);
        str = solve(str);
        Util.display(str);
    }

    public static String[] solve(String[] str) {
        Pattern pattern = Pattern.compile("(B|b)(L|l)(A|a)(C|c)(K|k)");
        for (int i = 0; i < str.length; i++) {
            Matcher matcher = pattern.matcher(str[i]);
            str[i] = matcher.replaceAll("white");
        }
        return str;
    }

    public static String[] addString() {
        String[] newStr = new String[5];
        newStr[0] = "The black cat with its sleek, glossy fur darted across the street.";
        newStr[1] = "She wore a stylish black dress to the elegant gala, complemented by BlAck heels.";
        newStr[2] = "The night sky was adorned with countless twinkling stars against a blaCK backdrop.";
        newStr[3] = "After the rain, the wet pavement glistened in the dim, Black streetlight.";
        newStr[4] = "The coffee shop served a rich, blACK brew that energized her every morning.";
        return newStr;
    }
}
