package com.junaid.string_logicals;
class Checking {
	void main() {
		boolean result = isPalindrome(IO.readln("Enter the String: "));
		IO.println(result);
}
	public static boolean isPalindrome(String s) {
		
		
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		
		
		String reversed = new StringBuilder(s).reverse().toString();

		return s.equals(reversed);
	}

}