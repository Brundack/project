package vectortopic;
import java.util.Vector;
public class Sample1 {
public static void main(String[] args) {
	Vector l1=new Vector();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	Vector l2=new Vector();
	l2.add('A');
	l2.add('B');
	l2.add('C');
	System.out.println(l1);
	System.out.println(l2);
	l1.addAll(l2);
	System.out.println(l1);
	System.out.println(l2);
}
}
