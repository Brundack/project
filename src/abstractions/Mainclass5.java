package abstractions;
interface Redbus
{
	void ticket();
}
class Vrl implements Redbus
{
	public void ticket()
	{
		System.out.println("500 rs");
	}
}
class Janatha implements Redbus
{
	public void ticket()
	{
		System.out.println("1000 rs");
	}
}
class Airavatha implements Redbus
{
	public void ticket()
	{
		System.out.println("1500 rs");
	}
}
class Stimulator4
{
	static void ansim(Redbus r1)
	{
		r1.ticket();
	}
}
public class Mainclass5 {
public static void main(String[]args)
{
	Vrl v1=new Vrl();
	Janatha j1=new Janatha();
	Airavatha a1=new Airavatha();
	Stimulator4.ansim(v1);
	Stimulator4.ansim(j1);
	Stimulator4.ansim(a1);
}
}
