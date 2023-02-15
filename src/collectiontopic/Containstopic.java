package collectiontopic;
import java.util.ArrayList;
public class Containstopic {
public static void main(String[] args) {
	ArrayList l1=new ArrayList();
	l1.add("bangalore");
	l1.add("mysore");
	l1.add("hassan");
	System.out.println(l1);
	if(l1.contains("Hassan"))
	{
		System.out.println("hassan is present");
	}
	else
	{
		System.out.println("hassan is not present");
	}
}
}
