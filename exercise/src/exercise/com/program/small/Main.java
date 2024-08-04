package exercise.com.program.small;

public class Main {
    public static void main(String[] args) {
    	//get value from user
        int[] usernumber = {5, 9, 3, 6};
        //call class and create obj.
        Small obj=new Small();
        //create variable for obj and call method of Small class
        int smallest = obj.smallNumber(usernumber);
        //print variable name.
        System.out.println("Small number is: " + smallest);
    }

  
}
