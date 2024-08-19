package exercise.com.program.sumofnumbers;

public class SumOfNumbers {
	public void sumOfNumbers(int num) {
		int total=0;
		int no=1;
		
		while(no<=num) {
			total=total+no;
			//diffrence b/w no eg:input=5  i,e.1+2+3+4+5=15.
			no=no+1;
		}
		System.out.println(total);
	}
	
	public void sumOfOddNumberAddition(int num) {
		int total=0;
		int no=1;
		
		while(no<=num) {
			total=total+no;
			//diffrence b/w no eg:input=5  i,e.1+3+5=9.
			no=no+2;
		}
		System.out.println(total);
	}
	
	public void sumOfEvenNumberAddition(int num) {
		int total=0;
		//to find even num so no st with 2
		int no=2;
		
		while(no<=num) {
			total=total+no;
			//no st with 2 so it st count with 2
			//diffrence b/w no eg:input=5  i,e.2+4.
			no=no+2;
		}
		System.out.println(total);
	}

	public void sumOfThreeNumberAddition(int num) {
		int total=0;
		int no=1;
		
		while(no<=num) {
			total=total+no;
			//diffrence b/w no eg:input=5  i,e.1+4+7+....
			no=no+3;
		}
		System.out.println(total);
	}
	
	public void sumOfTwoMultipleNumber(int num) {
		int total=0;
		int no=1;
		
		while(no<=num) {
			total=total+no;
			//diffrence b/w no   i,e.1  2  4   8  16  32.....
			            //eg:input:8   1+2+4+8
			no=no*2;
		}
		System.out.println(total);
	}
	
	public void sumOfMultipleNumber(int num) {
		int total=0;
		int no=1;
		int i=2;
		
		while(no<=num) {
			total=total+no;
			//diffrence b/w no   i,e.1  2  6   24  120  720.....  output:(720 varaikum alla num add panu =873)
			            //eg:input:720   *2  *3  *4   *5  *6
			no=no*i;
			i=i+1;
		}
		System.out.println(total);
	}
	
	public void sumOfDiffMultipleNumber(int num) {
		int total=0;
		int no=1;
		int i=2;
		
		while(no<=num) {
			total=total+no;
			//diffrence b/w no   i,e.1  2  8   48  384 .....  output:(400 kulla irukara alla num add panum  =443)
			        //eg:input:400   *2  *4  *6   *8  *6.....
			no=no*i;
			i=i+2;
		}
		System.out.println(total);
	}
	
	
}
