package exercise.com.program.pattern;

public class Pattern {
	public static void pattern(int num) {
		for(int row=1;row<=num;row++) {
			for(int col=1;col<=row;col++) {
				System.out.println(col);
			}
			System.out.println();
		}
	}

}
