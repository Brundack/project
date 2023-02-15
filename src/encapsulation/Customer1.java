package encapsulation;
class ICIC_Bank
{
	private String pwd="SBS";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
public class Customer1 {
public static void main(String[] args) {
	ICIC_Bank b1=new ICIC_Bank();
	String x=b1.getPwd();
	System.out.println(x);
	b1.setPwd("BRU");
	System.out.println("new password "+b1.getPwd());
	
}
}
