package exercise.com.program.pattern;

public class Pattern {
	public  void printPattern1(int n){
       
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
	}
        /*output
         
        *
        **
        ***
        ****
        *****
        ******
        
        */
	
    	public  void printPattern2(int n){

		for (int row = 6; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        	}
    	}
	/*output
	 * 
	 ******
	 *****
	 ****
	 ***
	 **
	 *

*/
    	
    	public  void printPattern3(int n){
		
    		
    	}
    	
    	
    	
    	
    	public void printPattern4(int num) {
    		
    		for(int row=1;row<=num;row++) {
    			for(int col=1;col<=row;col++) {
    				System.out.print(row);
    			}
    			System.out.println();
    		}
    	}
    	/*
    	1
    	22
    	333
    	4444
    	55555
	*/
    	
    	public void printPattern5(int num) {
    		
    		for(int row=1;row<=num;row++) {
    			for(int col=1;col<=row;col++) {
    				System.out.print(col);
    			}
    			System.out.println();
    		}
    	}
    	/*
    	1
    	12
    	123
    	1234
    	12345
    	*/
    	
    	
}
