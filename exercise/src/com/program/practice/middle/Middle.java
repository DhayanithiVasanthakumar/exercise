package com.program.practice.middle;

public class Middle {
	
	public static String middleLetter(String str) {

		int size=str.length();
		int middle=size/2;
		
		if(size %2 ==0) {
			//substring used to select begin index number to end index number. eg:obj.subString(10,16);
			//begin index :inclusive->include first index value
			//end index:exclusive->not include last index value.
			//line 8 :middle size is divided by 2, in that divided value "-1  ,+1"- center the value.
			return str.substring(middle -1,middle +1);
		}
		else {
			return String.valueOf(str.charAt(middle));
		}
	
	}

}
