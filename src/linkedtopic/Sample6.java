package linkedtopic;
import java.util.LinkedList;
public class Sample6 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	LinkedList l2=new LinkedList();
	l2.add(20);
	l2.add(40);
	l2.add(50);
	System.out.println(l1);
	System.out.println(l2);
	l1.retainAll(l2);
	System.out.println(l1);
	System.out.println(l2);
}
}
