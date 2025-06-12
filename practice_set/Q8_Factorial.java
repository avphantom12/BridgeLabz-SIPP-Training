package practice_set;
import java.util.Scanner;
public class Q8_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), fact = 1;
        if (num < 0) System.out.println("Enter positive number");
        else {
            int i = 1;
            while (i <= num) fact *= i++;
            System.out.println("Factorial: " + fact);
        }
    }
}
