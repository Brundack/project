package linkedtopic;
import java.util.LinkedList;
public class Sample7 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	
	System.out.println(l1);
	
	if(l1.contains(20))
			{
	System.out.println("true");
			}
	else
	{
	System.out.println("false");
	}
}
}
