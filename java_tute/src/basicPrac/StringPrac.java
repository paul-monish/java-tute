package basicPrac;

public class StringPrac {

	public static void main(String[] args) {
//		String str=new String("hello");
		//StringBuffer
		//StringBuilder
		String str1="hello";
		System.out.println(str1);
		String up=str1.toUpperCase();
		System.out.println(up);
		String lo=up.toLowerCase();
//		System.out.println(lo);
//		System.out.println(lo.length());
//		System.out.println(lo.indexOf('l',3));
//		System.out.println(lo.lastIndexOf('l'));
//		System.out.println(str1.charAt(4));
//		System.out.println(str1.replace("world", "Ram"));
//		System.out.println(str1.compareTo(lo));
//		System.out.println(str1.trim());
//		System.out.println("Hello".concat(" World"));
		System.out.println(up.substring(2,4));
		System.out.println(up.endsWith("O"));
		
	}

}
