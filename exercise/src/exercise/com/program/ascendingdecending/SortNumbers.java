package exercise.com.program.ascendingdecending;

import java.util.Arrays;

public class SortNumbers {
	
	public void sortNumbers() {
		
		int[] num= {1,5,7};
		
		//ascending order
		Arrays.sort(num);
		System.out.println("ascending order "+Arrays.toString(num));
		
		//decending order
		System.out.print("decending order is ");
		for(int i=num.length-1;i>=0;i--) {
			System.out.print(num[i]+" ");
		}
		
		
	}
}
