package com.program.reverse;

public class Reverse {

	public static String reverseString(String str) {
		//String keyword ilama obj create panalam
		
		/*StringBuffer:thread safe->1)synchronized->oru time la oru activity tha panum
													seqential action*/
		
		/*StringBuilder: non thread safe->1)non synchronized->oru time la multiple activity  panum
											parallel action*/
		
		/*String cannot be change to StringBuilder 
		so use toString()method->it change StringBuilder or StringBuffer to String*/
		return new StringBuilder(str).reverse().toString();
	}
}
