package exceptiontopic;

public class Demo {
public static void main(String[] args) {
	System.out.println("Main starts");
	try{
		int i=1/0;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("handled");
	}
	catch(ArithmeticException e)
	{
		System.out.println("caught");
	}
	System.out.println("Main ends");
}
}
