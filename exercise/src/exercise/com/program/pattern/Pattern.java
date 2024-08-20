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
		
    		for(int row=0; row<n; row++){
    			for(int col=2*(n-row); col>=0; col--){
    				System.out.print(" ");
    			}
    			for(int col=0; col<=row; col++){
    				System.out.print("* ");
    			}
    			System.out.println();
    		}
    	}
    	
    	
    	public void printPattern4() {
    		
    		for(int row=)
    	}

}
