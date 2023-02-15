package calling;
class SharedResource 
{
	 synchronized void res1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	 synchronized void res2()
	{
		for(int i=101;i<=110;i++)
		{
			System.out.println(i);
			try{
			Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Sample10 extends Thread
{
	SharedResource sr1;
	
		Sample10(SharedResource sr1)
		{
			this.sr1=sr1;
		}
	
		public void run()
		{
			sr1.res1();
		}
}
class Demo10 extends Thread
{
	SharedResource sr2;
	Demo10(SharedResource sr2)
	{
		this.sr2=sr2;
	}
	public void run()
	{
		sr2.res2();
	}
}

public class Size {
public static void main(String[] args) {
	SharedResource sr=new SharedResource();
	Sample10 s1=new Sample10(sr);
	Thread th1=new Thread(s1);
	th1.start();
	Demo10  d1=new Demo10(sr);
	Thread th2=new Thread(d1);
	th2.start();
			
}
}
