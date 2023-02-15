package exceptiontopic;

public class Cool{
public static void main(String[] args) {
	System.out.println("Main starts");
	try{
		int i=1/0;
	}
	catch(Exception a1)
	{
		System.out.println("handled");
	}
	
	
	System.out.println("Main ends");
}
}
