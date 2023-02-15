package abstractions;
interface Bookmyshow
{
	void movie();
}
class Bollywood implements Bookmyshow
{
public	void movie()
{
	System.out.println("sour");
}
}
class Sandalwood implements Bookmyshow
{
public	void movie()
{
	System.out.println("salt and sour");
}
}
class Hollywood implements Bookmyshow
{
public	void movie()
{
	System.out.println("Sweet");
}
}
class Stimulator3
{
	static void ansim(Bookmyshow b1)
	{
		b1.movie();
	}
}
public class Mainclass4 {
public static void main(String[]args)
{
 Bollywood j1=new Bollywood();
Hollywood p1=new Hollywood();
Sandalwood w1=new Sandalwood ();
Stimulator3.ansim(j1);
Stimulator3.ansim(p1);
Stimulator3.ansim(w1);

}
}

