package practice;
import java.util.Scanner;
public class Per {
 static void perfect(int no)
 {
	 int copy=no;
	 int sum=0;
	 for(int i=1;i<=no/2;i++)
	 {
		 if(no%i==0)
		 {
		 sum=sum+i;
		 }
	 }
	 if(sum==copy)
	 {
		 System.out.println(copy+" Perfect no");
	 }
	 else
	 {
		 System.out.println(copy+" not a perfect no");
	 }
 }
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number");
	 int no=sc.nextInt();
	perfect(no);
	
}
}
