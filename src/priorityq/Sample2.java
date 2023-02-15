package priorityq;
import java.util.PriorityQueue;
public class Sample2{
public static void main(String[] args) {
	PriorityQueue l1=new PriorityQueue();
	l1.add(10);
	l1.add(20);
	System.out.println(l1);
	l1.remove(20);
	System.out.println(l1);
}
}
