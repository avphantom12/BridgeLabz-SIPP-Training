package practice;

import java.util.Scanner;

public class DistanceFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        int feet = input.nextInt();

        int yards = feet / 3;
        double miles = yards / 1760.0;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
        input.close();
    }
}