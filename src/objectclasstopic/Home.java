package objectclasstopic;

public class Home {
	int cost;
	String name;
	String col;
	Home(int cost,String name,String col)
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
		Home h1=new Home(4000,"lucky","blue");
		System.out.println(h1);
	
	}

}
