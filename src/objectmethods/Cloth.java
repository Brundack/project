package objectmethods;

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
	public boolean equals(Object obj)
	{
		Cloth c2=(Cloth)obj;
		return(this.name==c2.name);
	}
	public static void main(String[] args) {
		Cloth c1=new Cloth(4000,"shirt","black");
	 Cloth c2=new Cloth(5000,"Pant","blue");
		System.out.println(c1.equals(c2));
	}
	}

