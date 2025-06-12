package practice_set;
import java.util.Scanner;
public class Q22_BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter weight");
        double weight = sc.nextDouble();
        System.out.println("enter height(in CM)");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        System.out.printf("BMI = %.2f\n", bmi);
        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi < 25) System.out.println("Normal");
        else if (bmi < 30) System.out.println("Overweight");
        else System.out.println("Obese");
    }
}
