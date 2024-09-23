class CommandLine{
	public static void main(String arg[]){
		int a=Integer.parseInt(arg[0]);
		int b=Integer.parseInt(arg[1]);
		int c=a+b;
		System.out.print("Addition of "+a+" and"+ b+ " is: "+ c);
	}
}