package practice_set;
import java.util.Scanner;
public class Q24_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt(), sum = 0, original = num;
        while (original != 0) {
            int digit = original % 10;
            sum += digit * digit * digit;
            original /= 10;
        }
        System.out.println(sum == num ? "Armstrong" : "Not Armstrong");
    }
}
