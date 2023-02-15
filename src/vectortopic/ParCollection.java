package vectortopic;
import java.util.Vector;
import java.util.ArrayList;
public class ParCollection {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(10);
	v.add(20);
	v.add(30);
	System.out.println(v);
	ArrayList l1=new ArrayList(v);
	l1.add('A');
	l1.add('B');
	l1.add('C');
	System.out.println(l1);
	System.out.println("***********");
	System.out.println(l1);
	System.out.println(v);
}
}
