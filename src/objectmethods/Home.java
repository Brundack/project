package objectmethods;



public class Home {
	int cost;
	String name;
	String col;
	Home(int cost,String name,String col)
	{
		this.cost=cost;
		this.name=name;
		this.col=col;
	}
	public boolean equals(Object obj)
	{
		Home h2=(Home)obj;
		return(this.name==h2.name);
	}
	public static void main(String[] args) {
		Home h1=new Home(4000,"lucky","blue");
		Home h2=new Home(4000,"lucky","blue");
		
		System.out.println(h1.equals(h2));
	
	

}

}
