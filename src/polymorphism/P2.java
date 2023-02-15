package polymorphism;
class Human
{
	void emotion()
	{
		System.out.println("emotions");
	}
}
class Sad extends Human
{
	void emotion()
	{
		System.out.println("huhu");
	}
}
class Angry extends Human
{
	void emotion()
	{
		System.out.println("Shit");
	}
}
class Happy extends Human
{
	void emotion()
	{
		System.out.println("haha");
	}
}
class Simulator1
{
	static void ansim(Human h1)
	{
		h1.emotion();
	}
}
public class P2 {
	
public static void main(String[]args)
{
	Sad s1 =new Sad();
	Angry a1=new Angry();
	Happy y1=new Happy();
	Simulator1.ansim(s1);
	Simulator1.ansim(a1);
	Simulator1.ansim(y1);
}
}
