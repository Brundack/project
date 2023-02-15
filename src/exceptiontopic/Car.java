package exceptiontopic;
class RideException extends Exception
{
	String msg;
	RideException(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class Car {
	static void book() throws RideException
	{
		int no=5;
		if(no<=4)
		{
			System.out.println("Happy journey");
		}
		else
		{
			throw new RideException("Too many people");
		}
	}
	public static void main(String[] args) {
		try
		{
			book();
		}
		catch(RideException e)
		{
			System.out.println(e.getmessage());
		}
	}
}
