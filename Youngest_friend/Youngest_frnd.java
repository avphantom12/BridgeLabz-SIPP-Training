import java.util.*;
public class Youngest_frnd {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the age");
		int Amarage = s.nextInt();
		int Akbarage = s.nextInt();
		int Anthonyage = s.nextInt();
		
		
		System.out.println("enter the height");
		int Amarheight = s.nextInt();
		int Akbarheight = s.nextInt();
		int Anthonyheight = s.nextInt();
		
		//int young_age=Math.min(Amarage,Math.min(Akbarage, Anthonyage));
		if((Amarage < Akbarage) && (Amarage < Anthonyage )){
			System.out.println("the youngest frnd among 3 is Amar");
			
		}
		else if((Akbarage < Amarage)&&(Akbarage < Anthonyage)) {
			System.out.println("the youngest frnd among 3 is Akbar");
		}
		else {
			System.out.println("the youngest frnd among 3 is Anthony");
		}

		//int tall_height=Math.max(Amarheight, Math.max(Akbarage, Anthonyage));
		if((Amarheight > Akbarheight) && (Amarheight > Anthonyheight )){
			System.out.println("the tallest frnd among 3 is Amar");
			
		}
		else if((Akbarheight > Amarheight)&&(Akbarheight> Anthonyheight)) {
			System.out.println("the tallest frnd among 3 is Akbar");
		}
		else {
			System.out.println("the tallest frnd among 3 is Anthony");
		}
		
		s.close();

	}
}
