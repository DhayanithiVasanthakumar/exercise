package exercise.com.program.numberseries;

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
	
	public void reverseNumber(int no) {
		/*
		//last number
		System.out.println("Last number   "+no1%10);
		
		//last ku munadi number
		//ithu int so point la irukarathu varathu  eg:  input=1234  ->  123.4  -> 123 nu store agum
		int no2=no1/10;
		//inga  123 nu irukum.atha modulo panum pothu last value kadaikum
		System.out.println("Last before "+no2%10);
		
		//last la iruhthu tird num venum na
		int no3=no2/10;
		System.out.println(no3%10);
		
		input:1234
		output:4321
		//etc...
		 
		 */
		
		//use while to simple this program
		//ihtha naala variable oda  memory save aaguthu
		//length kami aaguthu
		//0 vara varaikum program brak pani run panum
		while(no>0) {
			System.out.println(no%10);
			no=no/10;
		}
	}
	
	public void reverseNumberCondition1(int no) {
		while(no>0) {
			System.out.println(no%10);
			//100
			no=no/100;
			
//			input:123456
//			output:642
		}
	}
	
	public void reverseNumberCondition2(int no) {
		while(no>0) {
			//100
			System.out.println(no%100);
			no=no/100;
			
//			input:123456
//			output:56 34 12
		}
	}
	
	public void reverseNumberCondition3(int no) {
		while(no>1) {
			//100
			System.out.println(no%100);
			//10
			no=no/10;
			
//			input:123456
//			output:56 45 34 23 12 
		}
	}
	
	public void countInputNumber(int no) {
		int count=0;
		while(no>0) {
			
			count++;
			
			no=no/10;
			
			
//			input:123456
//			output:no of digits is 6
		}
		System.out.println("no of digits is "+count);
	}
	
	public void additionOfDigits(int no) {
		int count=0;
		while(no>0) {
			
			count=count+(no%10);
			
			no=no/10;
			
			
//			input:123456
//			output:add of digits is 21 
		}
		System.out.println("add of digits is "+count);
	}
}
