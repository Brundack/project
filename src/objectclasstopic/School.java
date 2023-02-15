package objectclasstopic;

public class School extends Object {
String sname;
char grade;
int strength;
School(String sname,char grade,int strength)
{
	this.sname=sname;
	this.grade=grade;
	this.strength=strength;
}
public String toString()
{
	return this.sname+" "+this.grade+""+this.strength;
	
}
public static void main(String[] args) {
	School s1=new School("sjc",'A',2000);
	System.out.println(s1);
}
}
