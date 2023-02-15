package exceptiontopic;

public class Sample5 {
public static void main(String[] args) {
	System.out.println("main starts");
	try{
		int i=8/0;
	}
	catch(ArithmeticException e)
	{
		int arr[]={10,20,30};
		try{
		System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("caught");
		}
	}
	System.out.println("main ends");
}
}
