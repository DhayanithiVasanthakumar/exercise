package exercise.com.program.pattern;

public class Pattern {
	public static void printPattern(int n){
       
		/* star 1
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
        
        */
		for (int row = 6; row >= 1; row--) {

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
		
		
		
		
    }

}
