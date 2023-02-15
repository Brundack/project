package encapsulation;
class Whatsapp
{
	private String pwd="Hello";

	public String getpwd() {
		return pwd;
	}

	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	
}
public class User {
public static void main(String[] args) {
	Whatsapp w1=new Whatsapp();
	System.out.println(w1.getpwd());
	w1.setpwd("bye");
	System.out.println(w1.getpwd());
}
}
