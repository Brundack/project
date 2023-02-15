package vectortopic;
import java.util.Vector;
public class Sample3 {
public static void main(String[] args) {
	Vector l1=new Vector();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	System.out.println(l1);
	l1.add(1,true);
	System.out.println(l1);
}
}
