package project;
import java.util.Scanner;

public class Numberone {
	public static void main(String args[]) {
		Scanner scanner= new Scanner(System.in);
		System.out.print("enter ur number:");
		int num=scanner.nextInt();
		if (num%2==0) {
			System.out.print("The number is even");
		}else {
			System.out.print("The number is odd");
		}
		scanner.close();
	}
}
