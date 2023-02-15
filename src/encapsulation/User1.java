package encapsulation;
class Phone
{
	private String pwd="Hello";

	public String getpwd() {
		return pwd;
	}

	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	
}
public class User1 {
public static void main(String[] args) {
 Phone p1=new Phone();
	System.out.println(p1.getpwd());
	p1.setpwd("bye");
	System.out.println(p1.getpwd());
}
}
