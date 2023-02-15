package collectiontopic;
import java.util.ArrayList;
public class Rm {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add("bangalore");
	l1.add("mysore");
	l1.add("hassan");
	l1.add("bidar");
	System.out.println(l1);
	l1.remove("bangalore");
	System.out.println(l1);
	l1.remove(2);
	System.out.println(l1);
}
}
