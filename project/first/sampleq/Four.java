package sampleq;
import java.util.*;
public class Four {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the double number: ");
		double a=sc.nextDouble();
		System.out.println("Integer value: ");
		int b=(int)a;
		if (a!=b) {
			System.out.println("Double value is missing.");
		}else {
			System.out.println("Double value is not missing");
		}
		sc.close();
	}
}
