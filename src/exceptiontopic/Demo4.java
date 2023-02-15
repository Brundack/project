package exceptiontopic;

import abstractclass.Mainclass;
class PhotosException extends Exception
{
	String msg;
	PhotosException(String msg)
	{
		this.msg=msg;
	}
	public String getmessage()
	{
		return msg;
	}
}
public class Demo4 {
static void video() throws PhotosException
{
	int num=39;
	if(num<=30)
	{
		System.out.println("Send successfully");
	}
	else
	{
		throw new PhotosException("Unable to send");
	}
}
	public static void main(String[]args)
	{
		try{
		video();
		}
		catch(PhotosException e)
		{
			System.out.println(e.getmessage());
		}
	}
	
}

