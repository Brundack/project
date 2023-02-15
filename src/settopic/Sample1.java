package settopic;
import java.util.HashSet;
public class Sample1 {
public static void main(String[] args) {
	HashSet l1=new HashSet();
	l1.add("hi");
	l1.add(10);
	l1.add(20);
	l1.add('A');
	HashSet l2= new HashSet();
	l2.add(20);
	l2.add('H');
	l2.add("java");
	l1.addAll(l2);
	System.out.println(l1);
}
}
