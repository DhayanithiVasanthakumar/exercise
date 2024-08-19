package exercise.com.program.sumofnumbers;

public class SumOfNumbers {
	public void sumOfNumbers(int num) {
		int total=0;
		int no=1;
		
		while(no<=num) {
			total=total+no;
			no=no+1;
		}
		System.out.println(total);
	}
}
