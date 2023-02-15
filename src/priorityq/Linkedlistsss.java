package priorityq;
import java.util.LinkedList;
public class Linkedlistsss {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add(10);
	l1.add(20.56);
	l1.add('A');
	l1.add(10);
	System.out.println(l1);
	System.out.println("peeking-->"+l1.peek());
	System.out.println(l1);
	System.out.println("polling-->"+l1.poll());
	System.out.println(l1);
	System.out.println("getting-->"+l1.get(2));
	System.out.println(l1);
		
}
}
