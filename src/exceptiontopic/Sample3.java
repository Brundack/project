package exceptiontopic;
import java.util.ArrayList;
import java.util.Vector;
import java.util.List;
public class Sample3 {
public static void main(String[] args) {
	System.out.println("main starts");
	List l1=new ArrayList();
	try{
	Vector l2=  (Vector) l1;
	}
	catch(ClassCastException e)
	{
		System.out.println("handled");
	}
	System.out.println("main ends");
	
}
}
