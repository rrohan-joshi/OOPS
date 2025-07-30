package project;
import java.util.Scanner;
public class PNZ {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter ur number:");
		int number=scan.nextInt();
		if (number<0) {
			System.out.print("negative");
		}else if(number==0) {
			System.out.print("Zero");	
		}else {
			System.out.print("Positive");
		}
		scan.close();
	}
}
