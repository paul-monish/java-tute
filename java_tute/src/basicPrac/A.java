package basicPrac;
import java.util.Scanner;
import java.io.*;
class B{
	void show() {
		System.out.println("Hii");
	}
	static void disp() {
		System.out.println("Ram");
	}
}


public class A {
	
	public static void main(String[] args) {
//		B b=new B();
//		b.show();
		B.disp();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a NUmber:");
		int a=sc.nextInt();
		System.out.print(a);
	}

}
