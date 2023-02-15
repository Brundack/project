package objectmethods;

public class Samples {
	public int hashCode()
	{
		return 12673;
	}
public static void main(String[] args) {
	Samples s1=new Samples();
	System.out.println(s1.hashCode());
	Samples s2=new Samples();
	System.out.println(s2.hashCode());
	}

}
