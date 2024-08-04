package exercise.com.program.middle;

public class Middle {
	
	public static String middleLetter(String str) {

		int size=str.length();
		int middle=size/2;
		
		if(size %2 ==0) {
			//substring used to display the center value
			//line 8 :middle size is divided by 2, in that divided value "-1  ,+1"- center the value.
			return str.substring(middle -1,middle +1);
		}
		else {
			return String.valueOf(str.charAt(middle));
		}
	
	}

}
