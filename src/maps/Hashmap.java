package maps;
import java.util.HashMap;
public class Hashmap {
static public void main(String[] args) {
	HashMap<String,Integer> l1=new HashMap<String,Integer>();
	l1.put("Dinga", 125);
	l1.put("Dingi", 584);
	l1.put("Dinga", 521);
	l1.put("cinga", 125);
	l1.put("penga", 125);
	
	System.out.println(l1);
}
}
