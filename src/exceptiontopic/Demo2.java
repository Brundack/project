package exceptiontopic;

import abstractclass.Mainclass;
class AgeException extends Exception
{
	String msg;
	AgeException(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class Demo2 {
static void votercard() throws AgeException
{
	int age=17;
	if(age>=18)
	{
		System.out.println("Eligible for voting");
	}
	else
	{
		throw new AgeException("Not eligible");
	}
}
	public static void main(String[]args)
	{
		try{
		votercard();
		}
		catch(AgeException e)
		{
			System.out.println(e.getmessage());
		}
	}
	
}

