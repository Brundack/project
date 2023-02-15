package priorityq;
import java.util.PriorityQueue;
public class Sample1{
public static void main(String[] args) {
	PriorityQueue l1=new PriorityQueue();
	l1.add(10);
	l1.add(20);
	PriorityQueue l2=new PriorityQueue();
	l2.add(30);
	l2.add(40);
    l2.add(50);
    System.out.println(l1);
    System.out.println(l2);
    l1.addAll(l2);
	System.out.println(l1);
	
}
}
