package exercise.com.program.pattern;

public class Pattern {
	public  void printPattern1(int num){
       
        for (int row = 1; row <= num; row++) {

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
	
    	public  void printPattern2(int num){

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
    	
    	public  void printPattern3(int num){
		
    		for(int row=num;row>=1;row--) {
    			for(int col=1;col<=row;col++) {
    				System.out.print(row);
    			}
    			System.out.println();
    		}
    		
    	}
/*output
55555
4444
333
22
1
    	 
*/
    	
    	public  void printPattern4(int num){
    		
    		for(int row=num;row>=1;row--) {
    			for(int col=1;col<=row;col++) {
    				System.out.print(col);
    			}
    			System.out.println();
    		}
    		
    	}
    	/*output
    	12345
    	1234
    	123
    	12
    	1
    	 */
    	
    	
    	
    	public void printPattern5(int num) {
    		
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
    	
    	public void printPattern6(int num) {
    		
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
    	
    	
    	public void printPattern7(int num) {
    		
    		for(int row=1;row<=num;row++) {
    			for(int col=1;col<=row;col++) {
    				System.out.print("*");
    			}
    			System.out.println();
    		}
    		for(int row=num-1;row>=1;row--) {
    			for(int col=1;col<=row;col++) {
    				System.out.print("*");
    			}
    			System.out.println();
    		}
    		
    	}
    	/*
    	 output
    	*
    	**
    	***
    	****
    	*****
    	****
    	***
    	**
    	*

    	*/
    	
     	
    	public void printPattern8(int num) {
    		
    		for(int row=1;row<=num;row++) {
    			for(int col=1;col<=row;col++) {
    				System.out.print(row);
    			}
    			System.out.println();
    		}
    		for(int row=num-1;row>=1;row--) {
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
    	4444
    	333
    	22
    	1
		*/
    	
    	public void printPattern9(int num) {
    		for(int row=1;row<=num;row++) {
    			for(int col=1;col<=row;col++) {
    				System.out.print(col);
    			}
    			System.out.println();
    		}
    		for(int row=num-1;row>=1;row--) {
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
    	1234
    	123
    	12
    	1
		*/
    	
    	public void printPattern10(int num) {
    		for(int row=1;row<=num;row++) {
    			for(int col=num;col>row;col--) {
    				System.out.print(col);
    			}
    			System.out.println();
    		}
    	}
    	
    	
    	
}
