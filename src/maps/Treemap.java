package maps;
import java.util.TreeMap;
public class Treemap {
public static void main(String[] args) {
	TreeMap<String,Integer> l1=new TreeMap<String,Integer>();
	l1.put("Dinga", 125);
	l1.put("Dingi",584);
	l1.put("Dinga", 521);
	l1.put("Cinga", 125);
	l1.put("Penga", 125);
	
	System.out.println(l1);
}
}
