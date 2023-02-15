package encapsulation;
class Insta
{
	private String user="Ram";

	public String getuser() {
		return user;
	}

	public void setuser(String user) {
		this.user = user;
	}
	
}
public class Customer2 {
public static void main(String[] args) {
 Insta i1=new Insta();
	System.out.println(i1.getuser());
	i1.setuser("lucky");
	System.out.println(i1.getuser());
}
}
