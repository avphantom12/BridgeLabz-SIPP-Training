package practice_set;
import java.util.Scanner;
public class Q5_SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0, input;
        while ((input = sc.nextDouble()) != 0) {
            total += input;
        }
        System.out.println("Total: " + total);
    }
}
