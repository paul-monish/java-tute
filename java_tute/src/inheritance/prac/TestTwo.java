package inheritance.prac;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestTwo {

	public static void main(String[] args) throws IOException {
//		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		float f=sc.nextFloat();
//		double d=sc.nextDouble();
//		String s=sc.next();
		
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
//		BufferedReader br2=new BufferedReader(ir);
		String a=br.readLine();
		
		int i=Integer.parseInt(a);
		double d=Double.parseDouble(a);
		float f=Float.parseFloat(a);
		
		System.out.println(i+" "+f+" "+d+" "+i);
	}

}
