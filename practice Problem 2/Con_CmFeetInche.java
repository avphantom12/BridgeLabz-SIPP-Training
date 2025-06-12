package practice;
import java.util.*;

public class Con_CmFeetInche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        int feet = (int) (heightCm / (2.54 * 12));
        int inches = (int) ((heightCm / 2.54) % 12);
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
        input.close();
	}

}
