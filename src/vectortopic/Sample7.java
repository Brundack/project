package vectortopic;
import java.util.Vector;
public class Sample7 {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("Bangalore");
		v.add("Mysore");
		System.out.println(v);
		if(v.contains("Mysore"))
		{
			System.out.println("Mysore is present");
		}
		else
		{
			System.out.println("Mysore is not present");
		}
	}
}
