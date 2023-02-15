package priorityq;
import java.util.PriorityQueue;
public class PeekPoll {
public static void main(String[] args) {
	PriorityQueue l1=new PriorityQueue();
	l1.add(10);
	l1.add(30);
	l1.add(5);
	l1.add(25);
	System.out.println("*******Peeking*****");
	System.out.println(l1);
	System.out.println(l1.peek());
	System.out.println(l1);
	System.out.println(l1.peek());
	System.out.println(l1);
	System.out.println("*******Polling*****");
	System.out.println(l1);
	System.out.println(l1.poll());
	System.out.println(l1);
	System.out.println(l1.poll());
	System.out.println(l1);
	System.out.println(l1.poll());
	System.out.println(l1);
}
}
