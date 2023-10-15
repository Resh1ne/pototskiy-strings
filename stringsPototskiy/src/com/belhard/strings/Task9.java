package com.belhard.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.belhard.util.Util;

public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] str = addString();
        Util.display(str);
        solve(str, scanner);
    }

    public static void solve(String[] str, Scanner scanner) {
        System.out.print("Enter a symbol: ");
        Pattern pattern = Pattern.compile(Util.userInputString(scanner));

        for (int i = 0; i < str.length; i++) {
            int count = 0;
            Matcher matcher = pattern.matcher(str[i]);

            while (matcher.find()) {
                count++;
            }
            System.out.println(count);
        }
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
