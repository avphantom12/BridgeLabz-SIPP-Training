package practice;

public class calculate_profit_loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;
        System.out.println("The Cost Price is INR " + costPrice + " and the Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
	}

}
