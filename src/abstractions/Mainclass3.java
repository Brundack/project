package abstractions;
interface Tea
{
	void taste();
}
class Ltea implements Tea
{
public	void taste()
{
	System.out.println("sour");
}
}
class Gtea implements Tea
{
public	void taste()
{
	System.out.println("salt and sour");
}
}
class Btea implements Tea
{
public	void taste()
{
	System.out.println("Sweet");
}
}
class Stimulator2
{
	static void ansim(Tea t1)
	{
		t1.taste();
	}
}
public class Mainclass3 {
public static void main(String[]args)
{
Ltea j1=new Ltea();
Gtea p1=new Gtea();
Btea w1=new Btea();
Stimulator2.ansim(j1);
Stimulator2.ansim(p1);
Stimulator2.ansim(w1);

}
}

