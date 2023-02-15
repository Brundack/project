package exceptiontopic;

public class Sample8 {
public static void main(String[] args) {
	System.out.println("main starts");
	int arr[]={10,20,30,40,50};
	int count=0;
	try
	{
	for(int i=0;;i++)
	{
		System.out.println(arr[i]);
		count++;
	}
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println(count);
	}
}
}
