package linkedtopic;
import java.util.LinkedList;
public class Sample8{
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	
	System.out.println(l1);
	
		for(int i=0;i<l1.size();i++)
	{
		Object x=l1.get(i);
		System.out.println(i+" "+x);
	}
}
}
