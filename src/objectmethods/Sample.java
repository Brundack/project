package objectmethods;

public class Sample{
String mname;
int mcost;
String mcol;
Sample(String mname,int mcost,String mcol)
{
	this.mname=mname;
	this.mcost=mcost;
	this.mcol=mcol;
}
public boolean equals(Object obj)
{
	Sample s2=(Sample)obj;
	return (this.mcost==s2.mcost);
}
public static void main(String[] args) {
	Sample s1=new Sample("vivo",20000,"blue");
	Sample s2=new Sample("mi",20000,"black");
	System.out.println(s1.equals(s2));
	
}
}
