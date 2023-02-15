package maps;
import java.util.LinkedHashMap;
public class Linkmap {
public static void main(String[] args) {
	LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
	l1.put("Dinga", 125);
	l1.put("Dingi", 584);
	l1.put("Dinga", 521);
	l1.put("penga", 125);
	l1.put("cinga", 125);
	l1.put("Dinga", 921);
	
	System.out.println(l1);
}
}
