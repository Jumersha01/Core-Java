package com.junaid.strings_logicals;

import java.util.Scanner;

public class RemoveCharacter {
    public String deleteOccurrences(String inputString, char removeChar) {
        StringBuilder result = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (c != removeChar) result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.next();

        System.out.print("Enter character to remove: ");
        char remove = sc.next().charAt(0);

        RemoveCharacter obj = new RemoveCharacter();
        String output = obj.deleteOccurrences(str, remove);

        System.out.println("Result: " + (output.isEmpty() ? "empty" : output));
    }
}

