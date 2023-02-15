package objectmethods;



public class Lap {
	int cost;
	String name;
	String col;
Lap(int cost,String name,String col)
	{
		this.cost=cost;
		this.name=name;
		this.col=col;
	}
public boolean equals(Object obj)
{
	Lap l2=(Lap)obj;
	return(this.name==l2.name);
}
public static void main(String[] args) {
	Lap l1=new Lap(20000,"dell","black");
	Lap l2=new Lap(20000,"dell","black");
	System.out.println(l1.equals(l2));



}
}
