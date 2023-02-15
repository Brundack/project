package objectclasstopic;

public class Bike {
int cost;
String name;
String col;
Bike(int cost,String name,String col)
{
	this.cost=cost;
	this.name=name;
	this.col=col;
}
public String toString()
{
	return this.cost+" "+this.name+" "+this.col;
}
public static void main(String[] args) {
	Bike b1=new Bike(4000,"Bullet","black");
	System.out.println(b1);
}
}
