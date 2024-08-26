package com.program.small;

public class Small {
	
	public static int smallNumber(int[]numbers) {
		
		int small=numbers[0];
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]<small) {
				small=numbers[i];
			}
			
		}
		return small;
	}

}
