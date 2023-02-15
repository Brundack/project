package polymorphism;

class Geometry
{
	void shape()
	{
		System.out.println("shapes");
	}
}
class Round extends Geometry
{
	void shape()
	{
		System.out.println("circle");
	}
}
class Square extends Geometry
{
	void shape()
	{
		System.out.println("box");
	}
}
class Rectangle extends Geometry
{
	void shape()
	{
		System.out.println("Rect");
	}
}
class Simulator4
{
	static void ansim(Geometry g1)
	{
		g1.shape();
	}
}
public class P5 {
	
public static void main(String[]args)
{
	Round r1 =new Round();
	Square s1=new Square();
	Rectangle t1=new Rectangle();
	Simulator4.ansim(r1);
	Simulator4.ansim(s1);
	Simulator4.ansim(t1);
}
}