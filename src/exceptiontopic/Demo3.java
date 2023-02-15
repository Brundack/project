package exceptiontopic;

import abstractclass.Mainclass;
class WhatsappException extends Exception
{
	String msg;
	WhatsappException(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class Demo3 {
static void video() throws WhatsappException
{
	int time=28;
	if(time>=30)
	{
		System.out.println("Send successfully");
	}
	else
	{
		throw new WhatsappException("Unable to send");
	}
}
	public static void main(String[]args)
	{
		try{
		video();
		}
		catch(WhatsappException e)
		{
			System.out.println(e.getmessage());
		}
	}
	
}

