package basicPrac;

public class StringBufferPrac {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("Hello");
//		str.append("World");
//		str.insert(2,"World");
//		str.delete(10,14);
//		str.reverse();
		
//		char[] s=new char[3];	
//		str.getChars(0, 2, s,1);
//		str.replace(0, 2, "hE");
//		str.length()
		
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4));
		System.out.println(str.indexOf("e"));
		System.out.println(str.charAt(2));
		System.out.println(str.subSequence(2,4));
		
	}
}
