package objectmethods;



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
	public boolean equals(Object obj)
	{
		Bike b2=(Bike)obj;
		return(this.name==b2.name);
	}
	public static void main(String[] args) {
		Bike b1=new Bike(4000,"Bullet","black");
		Bike b2=new Bike(5000,"duke","blue");
		System.out.println(b1.equals(b2));
	}
	}


