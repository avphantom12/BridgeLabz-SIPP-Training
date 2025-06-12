package practice;

import java.util.Scanner;

public class TotalPurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter unit price: ");
        int unitPrice = input.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        int totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and the unit price is INR " + unitPrice);
        input.close();
    }
}