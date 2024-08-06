package exercise.com.program.fibonacci;

public class Fibonacci {
	
	public  int fibonNumber(int num) {
	/*
		fibonacci:frist 2 number is sum of third number
		 after that 2nd number +sum of frist 2 number(third number)->fourth number......
		 
		
		int fristnumber=0,secondnumber=1;
		for(int i=0;i<=num;i++) {
			System.out.println(fristnumber);
			int thirdnumber=fristnumber+secondnumber;
			fristnumber=secondnumber;
			secondnumber=thirdnumber;
		}
		
		*/
		
	
	//using recursion
	
	
	
		if(num<=1) {
			return num;
		}
		else {
			return(fibonNumber(num-1)+fibonNumber(num-2));
		}
		
	}
	
}

	
