package objectmethods;



public class Tv {
	int cost;
	String brand;
	String type;
	Tv(int cost,String brand,String type)
	{
		this.cost=cost;
		this.brand=brand;
		this.type=type;
	}
	public boolean equals(Object obj)
	{
		Tv t2=(Tv)obj;
		return(this.brand==t2.brand);
	}
	public static void main(String[] args) {
		Tv t1=new Tv(3000,"Led","Samsung");
		Tv t2=new Tv(3000,"Led","Samsung");
		System.out.println(t1.equals(t2));
	}
}
