package exercise.com.program.enumswitch;

public class Switch {
	public static void switchSize(Size dosa) {
		switch(dosa) {
		case small:
			System.out.println("small dosa");
			break;
		case medium:
			System.out.println("medium dosa");
			break;
		case large:
			System.out.println("large dosa");
			break;
			
			default:
				System.out.println("invaid");
				break;
		}
	}

}
