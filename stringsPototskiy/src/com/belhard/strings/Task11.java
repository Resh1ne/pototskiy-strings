package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.belhard.util.Util;

public class Task11 {

    public static void main(String[] args) {
        String[] str = addString();
        Util.display(str);
        solve(str);
    }

    public static void solve(String[] str) {
        Pattern patternUpperСase = Pattern.compile("[A-Z]");
        Pattern patternLowerCase = Pattern.compile("[a-z]");
        for (int i = 0; i < str.length; i++) {
            Matcher matcherUpperСase = patternUpperСase.matcher(str[i]);
            Matcher matcherLowerCase = patternLowerCase.matcher(str[i]);
            int upperCase = 0;
            int lowercase = 0;

            while (matcherUpperСase.find() || matcherLowerCase.find()) {
                if (matcherUpperСase.find()) {
                    upperCase++;
                } else {
                    lowercase++;
                }
            }
            System.out.println("Upper Cases letters: " + upperCase);
            System.out.println("Lower Cases letters: " + lowercase);
            System.out.println("==================================");
        }
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
