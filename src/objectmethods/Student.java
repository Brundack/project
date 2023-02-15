package objectmethods;

public class Student {
String sname;
int strength;
char grade;
Student(String sname,int strength,char grade)
{
	this.sname=sname;
	this.strength=strength;
	this.grade=grade;
}
public boolean equals(Object obj)
{
	Student s2=(Student)obj;
	return (this.strength==s2.strength);
}
public static void main(String[] args) {
	Student s1=new Student("sjc",20000,'A');
	Student s2=new Student("bgs",20000,'B');
	if(s1.equals(s2))
	{
		System.out.println("strength is same");
	}
	else
	{
		System.out.println("strength is not same");
	}
}
}
