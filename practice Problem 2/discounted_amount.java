package practice;

public class discounted_amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int fee = 125000;
	        int discountPercent = 10;
	        double discount = (fee * discountPercent) / 100.0;
	        double finalFee = fee - discount;
	        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
	}

}
