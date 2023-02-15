package string;

public class Pgm1 {
	public static void main(String[] args) {
		int arr[]={8134,25652,78987,6381,2675,13531};
		for(int i=0;i<arr.length;i++)
		{
			int no=arr[i];
	      	int copy=no;
			int rev=0;
			while(no!=0)
			{
				int rem=no%10;
				rev=(rev*10)+rem;
				no=no/10;
			}
		if(rev==copy)
		
		{
			System.out.println("pallindrome no is"+rev);
		 int x=copy;
		 int sum=0;
		 while(copy>0||sum>9)
		 {
			 if(copy==0)
			 {
				 copy=sum;
				 sum=0;
			 }
			 sum=sum+copy%10;
			 copy=copy/10;
		 }
		 System.out.println("the sum of"+x+"is"+sum);
		 int fact=1;
		 for(int j=sum;j>+1;j--)
		 {
			 fact=fact*j;
		 }
		 System.out.println("the fact of sum of"+x+"is"+fact+"\n");
		}
		else 
		{
			System.out.println("not pallindrome is"+rev);
			int x=copy;
			 int sum=0;
			 while(copy>0||sum>9)
			 {
				 if(copy==0)
				 {
					 copy=sum;
					 sum=0;
				 }
				 sum=sum+copy%10;
				 copy=copy/10;
			 }
			 System.out.println("the sum of"+x+"is"+sum);
			 int f1=0;
			 int f2=1;
			 int f3=0;
			 for(int k=1;k<=sum;k++)
			 {
				 f3=f1+f2;
				 f1=f2;
				 f2=f3;
				 }
			 System.out.println("the fibnoci of sum of"+x+"is"+f3+"\n");
		}
	}
	}

}
