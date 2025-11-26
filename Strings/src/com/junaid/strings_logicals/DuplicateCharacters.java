package com.junaid.strings_logicals;

import java.util.Scanner;

public class DuplicateCharacters {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.next();

        char[] arr = input.toCharArray();

        System.out.println("Duplicate Characters:");

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '*') continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '*';
                }
            }

            if (count >= 2) {
                found = true;
                System.out.println(arr[i] + " = " + count);
            }
        }

        if (!found) {
            System.out.println("No duplicates found");
        }
    }
}
