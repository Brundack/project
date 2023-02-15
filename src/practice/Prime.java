package practice;
public class Prime {
	 public static void main(String[]args)
 {
	 for(int j=1;j<=100;j++)
	 {
		 boolean flag=true;
	
for(int i=2;i<j;i++)
{
	if(j%i==0)
	{
		flag=false;
		break;
	}
}
if(flag==true)
{
	System.out.println(j+"Prime no");
}
else
{
	System.out.println(j+" Not a Prime no");
}
}
}
 
}
