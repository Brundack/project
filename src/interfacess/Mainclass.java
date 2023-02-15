package interfacess;
interface Puma
{
	void shoes();

}
interface  Nike extends Puma
{
	void bag();
}
class Sample
{
	public void shoes()
	{
		System.out.println("hi");
	}
	public void bag()
	{
		System.out.println("hello");
	}
}
public class Mainclass {
public static void main(String[] args) {
	Sample s1=new Sample();
			s1.shoes();
			s1.bag();
				
			}
}

