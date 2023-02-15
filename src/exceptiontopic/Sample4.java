package exceptiontopic;

public class Sample4 {
public static void main(String[] args) {
	System.out.println("main starts");
	try{
	int i=8/2;	
    int arr[]={10,20,30};
    try{
    System.out.println(arr[i]);
	}
    catch(ArrayIndexOutOfBoundsException e)
    {
    	System.out.println("caught");
    }
	}
	catch(ArithmeticException e)
	{
		System.out.println("handled");
	}
	System.out.println("main ends");
}
}
