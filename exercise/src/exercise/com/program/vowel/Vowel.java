package exercise.com.program.vowel;

public class Vowel {

	/* vowel
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
	*/
		
	
	/*vowel in string
	public static boolean vowelCheck(String str) {
		
		return str.toLowerCase().matches(".*[aeiou].*");
	}
	*/
	
	//vowel count in string
	public static int vowelCheck(String str) {
		int count=0;
		str=str.toLowerCase();
		for(char ch:str.toCharArray()) {
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		return count;
		
	}
}
