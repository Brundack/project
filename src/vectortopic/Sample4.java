package vectortopic;
import java.util.Vector;
public class Sample4 {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add("Bangalore");
	v.add("Mysore");
	v.add("Hassan");
	v.add("Bidar");
	System.out.println(v);
	v.remove("Bidar");
	System.out.println(v);
	v.remove(0);
	System.out.println(v);
	
}
}
