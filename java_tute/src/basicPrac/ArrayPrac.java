package basicPrac;

import java.util.Scanner;

public class ArrayPrac {
	public static void main(String[] args) {
		String [] arr;
		String [] arr1= {"abc","efg","zxv"};
		int [] num= {10,20,30};
		int [] num1=new int[5];
		int [][] matx= {
				{1,2,3},
				{4,5,6}
		};
//		num[1];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			num1[i]=sc.nextInt();
		}
		
//		for(int i=0;i<num1.length;i++) {
//			System.out.print(num1[i]+" ");
//		}
		
		for(int n:num1) {
			System.out.print(n+" ");
		}
	}
}
