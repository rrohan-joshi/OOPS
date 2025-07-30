package sampleq;
import java.util.*;
public class Seven {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a=sc.nextInt();
		System.out.print("Enter the second number: ");
		int b=sc.nextInt();
		System.out.print("Enter the third number: ");
		int c=sc.nextInt();
		double average=(double)(a+b+c)/3;
		System.out.printf("The number entered are a=%d,b=%d,c=%d%n",a,b,c);
		System.out.printf("the average is %.2f%n",average);
		sc.close();
	}
}