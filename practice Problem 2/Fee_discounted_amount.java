package practice;
import java.util.*;

public class Fee_discounted_amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.print("Enter your fee: ");
        int fee = input.nextInt();
        System.out.print("Enter discount percent: ");
        int discountPercent = input.nextInt();

        double discount = (fee * discountPercent) / 100.0;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
        input.close();
	}

}
