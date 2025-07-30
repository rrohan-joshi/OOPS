package project;

import java.util.Scanner;
class Students{
	String name;
	int roll;
	int[] marks;
	void setter(String name, int roll,int[] marks) {
		this.name=name;
		this.roll=roll;
		this.marks=marks;
	}
	void getter() {
		System.out.println("Name of student: "+name);
		System.out.println("Roll number of student: "+ roll);
		System.out.println("Marks of student: ");
		for (int marks:marks) {
			System.out.println(marks+" ");
			}
		}
}
public class Student {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name of student: ");
		String name=sc.next();
		System.out.print("Enter roll no. of student: ");
		int roll=sc.nextInt();
		System.out.print("Enter number of subjects");
		int n=sc.nextInt();
		int[] marks=new int[n];
		for (int i=0;i<n;i++) {
			System.out.print("Enter marks of subject "+(i+1)+":");
			marks[i]=sc.nextInt();
		}
		Students st=new Students();
		st.setter(name,roll,marks);
		st.getter();
		sc.close();
	}
}
