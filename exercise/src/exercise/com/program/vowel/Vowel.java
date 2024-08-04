package exercise.com.program.vowel;

public class Vowel {

	public static String vowelCheck(String str) {
		str.toLowerCase();
		for(int i=1;i<str.length();i++) {
			//charAt:select particular index number of string
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch);
			}
		}
		return str;
	}
}
