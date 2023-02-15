package objectmethods;



public class Uni {
	String uname;
	String cname;
	int fees;
	Uni(String uname,String cname,int fees)
	{
		this.uname=uname;
		this.cname=cname;
		this.fees=fees;
	}
	public boolean equals(Object obj)
	{
		Uni u2=(Uni)obj;
		return(this.cname==u2.cname);
	}
	public static void main(String[] args) {
		Uni u1=new Uni("vtu","BE",50000);
		Uni u2=new Uni("vtu","BE",50000);
		System.out.println(u1.equals(u2));
	}
}
