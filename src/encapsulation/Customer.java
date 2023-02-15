package encapsulation;

class Gmail
{
	private int pwd=123;

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
}
public class Customer {
public static void main(String[] args) {
	Gmail g1=new Gmail();
	System.out.println(g1.getPwd());
	g1.setPwd(456);
	System.out.println("newpassword "+g1.getPwd());
	
}
}
