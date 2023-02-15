package threads;

class SharedResource
{
	  synchronized void res1()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			
		}
		
	}
	  synchronized void res2()
	{
		 for(int i=101;i<=110;i++)
		 {
			 System.out.println(i);
		 
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		 }
	}
}
class Test extends Thread
{
   SharedResource sr1;
   Test(SharedResource sr1)
   {
	   this.sr1=sr1;
   }
	public void run()
	{
		sr1.res1();
	}
	
}
class Cool1 extends Thread
{
	SharedResource sr2;
	Cool1(SharedResource sr2)
	{
		this.sr2=sr2;
	}
	public void run()
	{
		 sr2.res2();
	}
}
public class Mainclasss {
public static void main(String[] args) {
	SharedResource sr=new SharedResource();
	Test t1=new Test(sr);
	Thread th1=new Thread(t1);
	th1.start();
	Cool1 c1=new Cool1(sr);
	Thread th2=new Thread(c1);
	th2.start();
}
}

