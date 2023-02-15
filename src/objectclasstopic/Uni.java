package objectclasstopic;

public class Uni {
String uname;
String cname;
int fees;
Uni(String uname,String cname,int fees)
{
	this.uname=uname;
	this.cname=cname;
	this.fees=fees;
}
public String toString()
{
	return this.uname+" "+this.cname+" "+this.fees;
}
public static void main(String[] args) {
	Uni u1=new Uni("vtu","BE",50000);
	System.out.println(u1);
}
}
