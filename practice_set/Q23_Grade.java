package practice_set;
import java.util.Scanner;
public class Q23_Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks in physics , chemistry and maths accordingly");
        int phy = sc.nextInt(), chem = sc.nextInt(), math = sc.nextInt();
        double avg = (phy + chem + math) / 3.0;
        System.out.println("Average: " + avg);
        if (avg >= 90) System.out.println("Grade A");
        else if (avg >= 75) System.out.println("Grade B");
        else if (avg >= 60) System.out.println("Grade C");
        else System.out.println("Grade D");
    }
}
