package sampleq;
import java.util.*;
public class nine {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Binary of this value:"+Integer.toBinaryString(a));
		System.out.print("Enter the second number:");
		int b=sc.nextInt();
		System.out.println("Binary of this value:"+Integer.toBinaryString(b));
		System.out.println("\n-------------------------------");
		System.out.println("The result of AND operator is: "+(a&b));
		System.out.println("In binary:"+Integer.toBinaryString(a&b));
		System.out.println("The result of OR operator is: "+(a|b));
		System.out.println("In binary:"+Integer.toBinaryString(a|b));
		System.out.println("The result of XOR operator is: "+(a^b));
		System.out.println("In binary:"+Integer.toBinaryString(a^b));
		System.out.println("The result of Shift Left operator is: "+(a<<b));
		System.out.println("In binary:"+Integer.toBinaryString(a<<b));
		System.out.println("The result of Shift Right operator is: "+(a>>b));
		System.out.println("In binary:"+Integer.toBinaryString(a>>b));
		sc.close();
	}
}
