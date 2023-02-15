package polymorphism;

class Cloth
{
	void color()
	{
		System.out.println("color");
	}
}
class Pant extends Cloth
{
	void color()
	{
		System.out.println("blue");
	}
}
class Shirt extends Cloth
{
	void color()
	{
		System.out.println("black");
	}
}
class tshirt extends Cloth
{
	void color()
	{
		System.out.println("Red");
	}
}
class Simulator3
{
	static void ansim(Cloth c1)
	{
		c1.color();
	}
}
public class P4 {
	
public static void main(String[]args)
{
	Pant p1 =new Pant();
	Shirt s1=new Shirt();
	tshirt t1=new tshirt();
	Simulator3.ansim(p1);
	Simulator3.ansim(s1);
	Simulator3.ansim(t1);
}
}