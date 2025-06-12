import java.util.*;
public class odd_even_no {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the number from 1");
		int n = s.nextInt();
		
		if(n>0) {
			for(int i =1;i<=n;i++) {
				if(i%2==0) {
					System.out.println("The Number "+i+" is enev");
				}
				else {
					System.out.println("The Number "+i+" is odd");
				}
			}
		}
	}

}
