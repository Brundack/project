package priorityq;
import java.util.PriorityQueue;
public class Sample4{
public static void main(String[] args) {
	PriorityQueue l1=new PriorityQueue();
	l1.add(10);
	l1.add(20);
	l1.add(70);
	PriorityQueue l2=new PriorityQueue();
	l2.add(20);
	l2.add(40);
    l2.add(10);
    System.out.println(l1);
    System.out.println(l2);
    l1.retainAll(l2);
	System.out.println(l1);
	System.out.println(l2);
}
}
