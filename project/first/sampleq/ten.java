package sampleq;
import java.util.*;
public class ten {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int a=sc.nextInt();
		if (a%3==0 & a%5==0) {
			System.out.println("The number is divisible");
		}else {
			System.out.println("The number is not divisible");
		}
		sc.close();
	}
}
