package abstractions;
interface Bike
{
	void Sound();
}
class Java implements Bike
{
public	void Sound()
{
	System.out.println("Hi");
}
}
class Pulsar implements Bike
{
public	void Sound()
{
	System.out.println("Hello");
}
}
class BMW implements Bike
{
public	void Sound()
{
	System.out.println("Byee");
}
}
class Stimulator
{
	static void ansim(Bike b1)
	{
		b1.Sound();
	}
}
public class Mainclass1 {
public static void main(String[]args)
{
Java j1=new Java();
Pulsar p1=new Pulsar();
BMW w1=new BMW();
Stimulator.ansim(j1);
Stimulator.ansim(p1);
Stimulator.ansim(w1);

}
}
