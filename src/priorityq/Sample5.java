package priorityq;
import java.util.PriorityQueue;
public class Sample5{
public static void main(String[] args) {
	PriorityQueue l1=new PriorityQueue();
	l1.add(10);
	l1.add(20);
	l1.add(70);
	System.out.println(l1);
    if(l1.contains(10))
    		{
	System.out.println("10 is prsesnt");
    		}
    else
    {
    	System.out.println("10 is not present");
    }
	
}

}