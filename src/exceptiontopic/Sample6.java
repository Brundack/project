package exceptiontopic;

public class Sample6 {
public static void main(String[] args) {
	System.out.println("main starts");
	try{
		int i=1/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("handled");
	}
	finally
	{
		System.out.println("I finally blocked");
	}
	System.out.println("main ends");
}
}
