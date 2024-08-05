package exercise.com.program.fibonacci;

public class Fibonacci {
	
	public static void fibonNumber(int num) {
	/*
		fibonacci:frist 2 number is sum of third number
		 after that 2nd number +sum of frist 2 number(third number)->fourth number......
		 */
		
		int fristnumber=0,secondnumber=1;
		for(int i=0;i<=num;i++) {
			System.out.println(fristnumber);
			int thirdnumber=fristnumber+secondnumber;
			fristnumber=secondnumber;
			secondnumber=thirdnumber;
		}
		
		
		
	/*
	//using recursion
	
	int n=0;
	for(int num=0;i<n;i++) {
		System.out.println(fibonNumber(num));
	}
		
	public static int fibonNumber(int num) {
		if(num==0||num==1) {
			return num;
		}
		else {
			return(fibonNumber(num-1)+fibonNumber(num-2));
		}
	}
	*/
	
	}

	}
