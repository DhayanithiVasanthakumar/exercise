package com.program.palindrome;

public class Palindrome {
	
	public static String palindromeCheck(String str) {
		String st=new StringBuffer(str).reverse().toString();
		return st.equalsIgnoreCase(str)?"it is palindrome":"it is not palindrome";
	}

}
