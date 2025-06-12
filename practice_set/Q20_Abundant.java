package practice_set;
import java.util.Scanner;
public class Q20_Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt(), sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) sum += i;
        }
        System.out.println(sum > num ? "Abundant Number" : "Not Abundant");
    }
}
