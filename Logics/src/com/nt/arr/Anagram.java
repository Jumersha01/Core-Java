package com.nt.arr;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String word1 = "sillent";
		String word2 = "istlen";
		if(anagram(word1, word2)) {
			System.out.println("Words are anagram..");
		} else {
			System.out.println("Words are not anagram..");
		}
	}

	public static boolean anagram(String word1, String word2) {

		boolean isAnagram = false;

		if (word1.length() != word2.length()) {
			return isAnagram;
		} else {

			for (int i = 0; i < word1.length(); i++) {

				char ch = word1.charAt(i);

				int count1 = 0;
				int count2 = 0;

				for (int j = 0; j < word1.length(); j++) {
					if (ch == word1.charAt(j)) {
						count1++;
					}
					if (ch == word2.charAt(j)) {
						count2++;
					}
				}

				if (count1 != count2) {
					return isAnagram;
				} else {
					isAnagram = true;
				}
			}
		}

		return isAnagram;
	}
}
