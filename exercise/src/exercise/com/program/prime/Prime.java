package exercise.com.program.prime;

public class Prime {

	public static int primeNumber(int num) {
		int i=2;
		boolean prime=true;
		
		while(i<num) {
			if(num%i==0){
				 System.out.println("it is not prime");
				 prime=false;
				 i=i+1;
				 break;
			}
			if(prime==true) {
				System.out.println("it is prime");
				break;
			}
				
			}
			return num;
		}
	
}
