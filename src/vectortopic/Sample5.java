package vectortopic;
import java.util.Vector;
public class Sample5 {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(10);
	v.add(20);
	v.add(30);
	v.add(40);
	Vector v1=new Vector();
	v1.add(30);
	v1.add(40);
	v1.add(50);
	v1.add(60);
	System.out.println(v);
	System.out.println(v1);
	v.removeAll(v1);
	System.out.println(v);
	System.out.println(v1);
}
}
