package abstractions;
interface Ola
{
	void ride();
}
class Auto implements Ola
{
public	void ride()
{
	System.out.println("3 persons");
}
}
class Bikes implements Ola
{
public	void ride()
{
	System.out.println("2 persons");
}
}
class Car implements Ola
{
public	void ride()
{
	System.out.println("4 persons");
}
}
class Stimulator1
{
	static void ansim(Ola o1)
	{
		o1.ride();
	}
}
public class Mainclass2 {
public static void main(String[]args)
{
Auto j1=new Auto();
Bikes p1=new Bikes();
Car w1=new Car();
Stimulator1.ansim(j1);
Stimulator1.ansim(p1);
Stimulator1.ansim(w1);

}
}

