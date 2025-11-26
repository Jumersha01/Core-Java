package com.junaid.strings_logicals;


import java.util.Scanner;

public class CountOccurrence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next();

        System.out.print("Enter character to count: ");
        char ch = sc.next().charAt(0);

        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }

        System.out.println("Occurrence of '" + ch + "' = " + count);
    }
}
