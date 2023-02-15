package threads;
class Sample implements Runnable
{
	public void run() 
	{
		for(int i=1;i<10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
class Demo1 extends Thread
{
	public void run()
	{
		for(int i=101;i<=120;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}
public class Mainclass {
public static void main(String[] args) {
	

	Sample s1=new Sample();
	Thread th1=new Thread(s1);
	th1.start();
	Demo1 d1=new Demo1();
	Thread th2=new Thread(d1);
	th2.start();
}
}
