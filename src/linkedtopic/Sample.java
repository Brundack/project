package linkedtopic;
import java.util.LinkedList;
public class Sample {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	System.out.println(l1);
	l1.add(1,40);
	System.out.println(l1);
}
}
