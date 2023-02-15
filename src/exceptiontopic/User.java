package exceptiontopic;

	class MarriageException extends Exception
	{
		String msg;
		MarriageException(String msg)
		{
			this.msg=msg;
		}
		public String getmessage()
		{
			return msg;
		}
	}
	public class User {
static void submit() throws MarriageException
{
int age=16;
if(age>=21)
{
System.out.println("HAPPY LIFE");	
}
else
{
	throw new MarriageException("Invalid age");
}
}

public static void main(String[] args) {
	try{
	submit();
	}
	catch(MarriageException e)
	{
		System.out.println(e.getmessage());
	}
}
}

