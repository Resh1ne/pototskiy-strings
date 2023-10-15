package com.belhard.util;

import java.util.Scanner;

public class Util {
    public static void display(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println();
    }

    public static String userInputString(Scanner scan) {
        String a;
        if (scan.hasNextLine()) {
            a = scan.nextLine();
        } else {
            throw new RuntimeException("You did not enter an integer!");
        }
        return a;
    }
}
