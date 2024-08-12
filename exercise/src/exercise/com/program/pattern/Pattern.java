package exercise.com.program.pattern;

public class Pattern {
	public static void printPattern(int n)
    {
       
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }

            // printing new line for each row
            System.out.println();
        }
    }

}
