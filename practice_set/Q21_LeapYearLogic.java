package practice_set;
import java.util.Scanner;
public class Q21_LeapYearLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year");
        int year = sc.nextInt();
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}
