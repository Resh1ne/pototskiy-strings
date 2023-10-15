package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.belhard.util.*;

public class Task1 {

    public static void main(String[] args) {
        String[] camelCase = addString();
        Util.display(camelCase);
        camelCase = solve(camelCase);
        Util.display(camelCase);
    }

    public static String[] solve(String[] camelCase) {
        Pattern pattern = Pattern.compile("\\B([A-Z])");

        for (int i = 0; i < camelCase.length; i++) {
            Matcher matcher = pattern.matcher(camelCase[i]);

            StringBuilder strb = new StringBuilder();
            while (matcher.find()) {
                matcher.appendReplacement(strb, "_$0");
            }
            matcher.appendTail(strb);

            camelCase[i] = strb.toString().toLowerCase();
        }
        return camelCase;
    }

    public static String[] addString() {
        String[] newStr = new String[5];
        newStr[0] = "helloWorld";
        newStr[1] = "goodDay";
        newStr[2] = "iNotBigString";
        newStr[3] = "iSmallString";
        newStr[4] = "HowAreYou";
        return newStr;
    }
}
