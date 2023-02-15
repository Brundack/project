package calling;
class Sample1
{
	Sample1()
	{
		System.out.println("lalala");
	}
}
class Demo extends Sample1
{
	Demo(String str)
	{
		
	}
}
class Test extends Demo
{
	Test(int x,String y)
	{
		super("hi");
		System.out.println("lulululu");
	}
	
}
class THIS
{
	public static void main(String[] args) {
		Test t1=new Test(10,"hi");
	}
}
	
