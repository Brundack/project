package linkedtopic;
import java.util.LinkedList;
public class Sample1 {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	LinkedList l2=new LinkedList();
	l2.add('A');
	l2.add('B');
	l2.add('B');
	System.out.println(l1);
	System.out.println(l2);
	l1.addAll(l2);
	System.out.println(l1);
	System.out.println(l2);
}
}
