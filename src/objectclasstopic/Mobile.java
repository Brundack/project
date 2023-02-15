package objectclasstopic;

public class Mobile extends Object {
int mcost;
String mname;
String mcol;
Mobile(int mcost,String mname,String mcol)
{
	this.mcost=mcost;
	this.mname=mname;
	this.mcol=mcol;
}
public String toString()
{
	return this.mcost+" "+this.mname+" "+this.mcol;
}
public static void main(String[]args)
{
	Mobile m1=new Mobile(25000,"vivo","blue");
	System.out.println(m1);
}
}
