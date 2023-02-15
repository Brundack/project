package threads;

public class Cool {
public static void main(String[] args) {
	Thread th1=Thread.currentThread();
	System.out.println(th1.getId());
	System.out.println(th1.getName());
	System.out.println(th1.getPriority());
	System.out.println("**********");
	th1.setPriority(6);
	th1.setName("onethread....");
	System.out.println(th1.getId());
	System.out.println(th1.getName());
	System.out.println(th1.getPriority());
}
}
