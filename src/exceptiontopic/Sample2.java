package exceptiontopic;

public class Sample2 {
public static void main(String[] args) {
	System.out.println("main starts");
	Sample s1=null;
	try{
	System.out.println(s1.hashCode());
	}
	catch(NullPointerException e)
	{
		System.out.println("handled");
	}
	
	System.out.println("main ends");
}
}
