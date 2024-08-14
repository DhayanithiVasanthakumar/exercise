package exercise.com.program.pattern;

public class Pattern {
	public static void printPattern(int n){
       int row,col;
		/* 
		 //star 1
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
        
*
**
***
****
*****
******
        
        //star 2
		for (int row = 6; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
	
		
******
*****
****
***
**
*
*/
		
		//star 3
		
       for(row=0; row<n; row++){
           for(col=2*(n-row); col>=0; col--){
               System.out.print(" ");
           }
           for(col=0; col<=row; col++){
               System.out.print("* ");
           }
    
           System.out.println();
       }

    
		
		
    }

}
