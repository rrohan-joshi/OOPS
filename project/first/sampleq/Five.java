package sampleq;
import java.util.*;
public class Five {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Character entered: ");
		char letter=sc.next().charAt(0);
		int value=letter;
		System.out.print("Value of that letter is: "+value);
		sc.close();
	}
}
