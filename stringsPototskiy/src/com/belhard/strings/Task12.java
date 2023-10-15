package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task12 {

    public static void main(String[] args) {
        String str = addString();
        System.out.println(str);
        solve(str);
    }

    public static void solve(String str) {
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(str);
        int sent = 0;

        while (matcher.find()) {
            sent++;
        }
        System.out.println("Number of sentences in the text: " + sent);
    }

    public static String addString() {
        String newStr = "The black cat with its sleek, glossy fur darted across the street. "
                + "She wore a stylish black dress to the elegant gala, complemented by BlAck heels. "
                + "The night sky was adorned with countless twinkling stars against a blaCK backdrop. "
                + "After the rain, the wet pavement glistened in the dim, Black streetlight. "
                + "The coffee shop served a rich, blACK brew that energized her every morning. ";
        return newStr;
    }
}
