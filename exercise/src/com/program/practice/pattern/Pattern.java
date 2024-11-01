package com.program.practice.pattern;

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
    	
    	
   
    	/*
    	 *	 5 
			5 4 
			5 4 3 
			5 4 3 2 
			5 4 3 2 1 
    	 */

    	public void printPattern11(int num) {

    		for (int row = num; row >= 1; row--)
            {
                for (int col = num; col >= row; col--)
                {
                    System.out.print(col+" ");
                }
     
                System.out.println();
            }
    	}
    	
    	
    	/*
    	 * 5 4 3 2 1 
			5 4 3 2 
			5 4 3 
			5 4 
			5 
    	 * 
    	 */
    	public void printPattern12(int num) {

    		for (int row = 1; row <= num; row++)
            {
                for (int col = num; col >= row; col--)
                {
                    System.out.print(col+" ");
                }
     
                System.out.println();
            }
    	}
    	
    	
    	public void printPattern13(int num) {

    	for (int row = 1; row <= num; row++)
        {
            for (int col = row; col >= 1; col--)
            {
                System.out.print(col+" ");
            }
 
            System.out.println();
        }
    	
    	}
    	
    	
    	
    	
    	/*
    	 * 5 4 3 2 1 
			4 3 2 1 
			3 2 1 
			2 1 
			1 

    	 */
    	
    	
    	
    	public void printPattern14(int num) {
    	for (int row = num; row >= 1; row--)
        {
            for (int col = row; col >= 1; col--)
            {
                System.out.print(col+" ");
            }
 
            System.out.println();
        }
    	}
    	
    	public void printPattern15(int num) {

    	for (int i = 1; i <= num; i++)
        {
            //Printing first half of the row
 
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
 
            //Printing second half of the row 
 
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
 
            System.out.println();
        }
    	}
    	
    	
    	
    	/*
    	 *     
    	 *     
        1 
      1 2 
    1 2 3 
  1 2 3 4 
1 2 3 4 5 
    	 *     
    	 */
    	
    	public void printPattern16(int rows) {

    	 for (int i = 1; i <= rows; i++)
         {
  
             for (int j = 2*rows-i; j > i; j--)
             {
                 System.out.print(" ");
             }
  
  
             for (int j = 1; j <= i; j++)
             {
                 System.out.print(j+" ");
             }
  
             System.out.println();
         }
    	}
    	
    	
    	
    	
    	/*
    	 * 
1 2 3 4 5 
  1 2 3 4 
    1 2 3 
      1 2 
        1 


    	 */
    	public void printPattern17(int rows) {
    	  for (int i = rows; i >= 1; i--)
          {
             
   
              for (int j = 2*rows-i; j > i; j--)
              {
                  System.out.print(" ");
              }
   
   
              for (int j = 1; j <= i; j++)
              {
                  System.out.print(j+" ");
              }
   
              System.out.println();
          }
    	}
    	
    	
    	/*
    	 * 
        1 
      2 1 
    3 2 1 
  4 3 2 1 
5 4 3 2 1 

    	 */
    	public void printPattern18(int rows) {

    	 for (int i = 1; i <= rows; i++)
         {
  
             for (int j = 2*rows-i; j > i; j--)
             {
                 System.out.print(" ");
             }
    
             for (int j = i; j >= 1; j--)
             {
                 System.out.print(j+" ");
             }
  
             System.out.println();
         }
    	}
}

