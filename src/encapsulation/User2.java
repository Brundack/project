package encapsulation;
class Facebook
{
	private String pwd="Java";

	public String getpwd() {
		return pwd;
	}

	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	
}
public class User2 {
public static void main(String[] args) {
 Facebook f1=new Facebook();
	System.out.println(f1.getpwd());
	f1.setpwd("web");
	System.out.println(f1.getpwd());
}
}
