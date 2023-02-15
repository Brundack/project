package stringclasstopic;

public class Sample {
public static void main(String[] args) {
	String s1="bye";
	String s2="bye";
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	String s3=new String("IBM");
	String s4=new String("IBM");
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
}
}
