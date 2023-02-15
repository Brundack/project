package vectortopic;
import java.util.Vector;
public class Sample8 {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add(10);
	v.add(20);
	v.add(30);
	for(int i=0;i<v.size();i++)
	{
		Object x=v.get(i);
		
	
	System.out.println(i+" "+x);
}
}
}
