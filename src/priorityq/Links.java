package priorityq;
import java.util.LinkedList;
public class Links {
public static void main(String[] args) {
	LinkedList l1=new LinkedList();
	l1.add("ORACLE DB");
	l1.add("SQL DB");
	l1.add("IDS DB");
	l1.add("Mongo DB");
	l1.add("SAP DB");
	for(int i=0;i<l1.size();i++)
	{
		if(l1.get(i)=="IDS DB")
		{
			l1.remove("IDS DB");
			break;
		}
	}
	System.out.println(l1);
}
}
