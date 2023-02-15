package exceptiontopic;

public class Sample {
public static void main(String[] args) {
	System.out.println("Main starts......");
	try{
	int i=1/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("handles....");
	}
	System.out.println("Main ends.....");
}
}
