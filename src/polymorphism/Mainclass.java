package polymorphism;
class Weather
{
	void season()
	{
		System.out.println("seasons");
	}
}
class Summer extends Weather
{
	void season()
	{
	System.out.println("Hot");
	}
}
class Winter extends Weather
{
	void season()
	{
		System.out.println("cold");
	}
}
class Rainy extends Weather
{
	void season()
	{
		System.out.println("chill");
	}
}
class Simulator
{
	static void ansim(Weather w1)
	{
		w1.season();
	}
}
public class Mainclass {
public	static void main(String[]args)
	{
	Summer s1=new Summer();
	Winter l1=new Winter();
	Rainy r1=new Rainy();
	Simulator.ansim(s1);
	Simulator.ansim(l1);
	Simulator.ansim(r1);
	}

}
