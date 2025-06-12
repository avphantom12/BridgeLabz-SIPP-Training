package practice;
import java.util.*;

public class kilometers_to_mile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        double km = input.nextDouble();

        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
	}

}
