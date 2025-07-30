package sampleq;
import java.util.*;
public class Three {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number: ");
		int a=sc.nextInt();
		System.out.println("Integer value: "+a);
		long b=a;
		System.out.println("Long value: "+b);
		if (b==a) {
			System.out.println("Data is not lost");
		}else {
			System.out.println("Data is lost");
		}
		float c=b;
		System.out.println("Float value: "+c);
		if ((int)c==a) {
			System.out.println("Again,no data was lost");
		}else {
			System.out.println("Data was lost again.");
		}
		sc.close();
	}
}
