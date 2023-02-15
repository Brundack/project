package encapsulation;
class Sum
{
	private String pwd="Dinga";

	public String getpwd() {
		return pwd;
	}

	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	
}
public class Yahoo {
public static void main(String[] args) {
 Sum s1=new Sum();
	System.out.println(s1.getpwd());
	s1.setpwd("Dingi");
	System.out.println(s1.getpwd());
}
}

