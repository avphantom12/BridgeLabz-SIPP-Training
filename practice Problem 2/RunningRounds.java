package practice;

import java.util.Scanner;

public class RunningRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1 in meters: ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 in meters: ");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 in meters: ");
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3; // in meters
        double distanceKm = 5; // km
        double perimeterKm = perimeter / 1000.0; // convert to km
        int rounds = (int) Math.ceil(distanceKm / perimeterKm);
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
        input.close();
    }
}