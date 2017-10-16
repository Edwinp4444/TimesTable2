import java.util.Random;
import java.util.Scanner;
public class TimesTable2 {

	public static void main(String[] agrs) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Random rnd=new Random();

		//Setup Variables
		int hi;
		int low;
		int num;
		
		
		//Ask for hi, low and number
		System.out.println("Welcome to the Times Table Challenge number 2!");
		System.out.println("What is the biggest number you want?");
		hi=in.nextInt();
		System.out.println("What is the smallest number you want?");
		low=in.nextInt();
		
		
			
		//Loop and ask questions or not 
		for (int x=low; x<=hi; x++) {
			System.out.print("\t");
			System.out.print(x);
		}
		System.out.println();
		
		for (int x=low; x<=hi; x++) {
			System.out.print(x);
			System.out.print("\t");
			
			for (int y=low; y<=hi; y++) {
				System.out.print(y*x);
				System.out.print("\t");
			}
			
			System.out.println();
		}
	}
}