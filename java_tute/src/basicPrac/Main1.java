package basicPrac;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

	public static void main(String[] args) throws IOException {
//		int []arr= {1,2,3,4,5,6};
//		for(int i=0;i<arr.length;i++) {
//			if(i==2) continue;
//			System.out.print(arr[i]);
//		}
		
//		for(int x:arr) {
//			System.out.println(x);
//		}
		
//		int a=5;
//		double d=a;
//		System.out.println(a);
//		System.out.println(d);

		
//		double d=7.58d;
//		int a=(int)d;
//		System.out.println(a);
//		System.out.println(d);
			
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		
		String s=br.readLine();
		int i=Integer.parseInt(s);
		System.out.print(i);
		
	}

}
