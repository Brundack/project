package collectiontopic;
import java.util.ArrayList;
public class Alm {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(40);
	ArrayList l2=new ArrayList();
	l2.add(60);
	l2.add(70);
	l2.add(80);
	System.out.println(l1);
	System.out.println(l2);
	l1.addAll(l2);
	System.out.println("************");
	System.out.println(l1);
	System.out.println(l2);
}
}
