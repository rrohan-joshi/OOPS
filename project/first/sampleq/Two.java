package sampleq;
import java.util.*;
class Student{
	String name;
	int roll;
	int age;
	String gender;
	double percentage;
		void setter(String name, int roll,int age,String gender,double percentage) {
			this.name=name;
			this.roll=roll;
			this.age=age;
			this.gender=gender;
			this.percentage=percentage;
		}
		void getter() {
			System.out.printf("Name of student: %s%n",name);
			System.out.printf("Roll number of student: %d%n",roll);
			System.out.printf("Age of student: %d%n",age);
			System.out.printf("Gender of student: %s%n",gender);
			System.out.printf("Percentage of student: %.2f%n",percentage);
				}
		}
public class Two {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name of student:");
		String name=sc.next();
		System.out.print("Enter roll no. of student: ");
		int roll=sc.nextInt();
		System.out.print("Enter age of student: ");
		int age =sc.nextInt();
		System.out.print("Enter gender \"M or F\": " );
		String gender=sc.next();
		System.out.print("Enter Percentage of Student: ");
		double percentage=sc.nextDouble();
		Student st=new Student();
		st.setter(name,roll,age,gender,percentage);
		st.getter();
		sc.close();
	}
}
