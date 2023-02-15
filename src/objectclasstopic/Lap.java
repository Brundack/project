package objectclasstopic;

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
	public String toString()
	{
		return this.cost+" "+this.name+" "+this.col;
	}
	public static void main(String[] args) {
		Lap l1=new Lap(20000,"dell","black");
		System.out.println(l1);
	
	

}

}


