package objectclasstopic;
public class Car {

int cost;
String name;
String col;
Car(int cost,String name,String col)
{
	this.cost=cost;
	this.name=name;
	this.col=col;
}
public String toString()
{
	return this.cost+" "+this.name+" "+this.col;
}
public static void main(String[]args)
{
	Car m1=new Car(25000,"maruthi","blue");
	System.out.println(m1);
}
}

