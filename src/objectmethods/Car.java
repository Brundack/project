package objectmethods;

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
	public boolean equals(Object obj)
	{
		Car c2=(Car)obj;
		return(this.name==c2.name);
	}
	public static void main(String[] args) {
		Car c1=new Car(4000,"shirt","black");
	 Car c2=new Car(5000,"Pant","blue");
		System.out.println(c1.equals(c2));
	
	}
}
