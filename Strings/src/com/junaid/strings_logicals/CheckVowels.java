package com.junaid.strings_logicals;

import java.util.Scanner;

public class CheckVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next().toLowerCase();

        boolean hasVowel = false;

        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                hasVowel = true;
                break;
            }
        }

        if (hasVowel)
            System.out.println("Contains vowels");
        else
            System.out.println("No vowels found");
    }
}
