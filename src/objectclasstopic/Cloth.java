package objectclasstopic;

public class Cloth {
	int cost;
	String name;
	String col;
Cloth(int cost,String name,String col)
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
		Cloth c1=new Cloth(2000,"shirt","blue");
		System.out.println(c1);
	
	

}

}
