package polymorphism;

class Bottle
{
	void shape()
	{
		System.out.println("shapes");
	}
}
class Wbottle extends Bottle
{
	void shape()
	{
		System.out.println("hot");
	}
}
class Mbottle extends Bottle
{
	void shape()
	{
		System.out.println("badam milk");
	}
}
class Jbottle extends Bottle
{
	void shape()
	{
		System.out.println("Apple");
	}
}
class Simulator2
{
	static void ansim(Bottle b1)
	{
		b1.shape();
	}
}
public class P3 {
	
public static void main(String[]args)
{
	Wbottle w1 =new Wbottle();
	Mbottle m1=new Mbottle();
	Jbottle j1=new Jbottle();
	Simulator2.ansim(w1);
	Simulator2.ansim(m1);
	Simulator2.ansim(j1);
}
}
