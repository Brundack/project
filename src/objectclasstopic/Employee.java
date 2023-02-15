package objectclasstopic;

public class Employee {
int id;
char grade;
Employee(int id,char grade)
{
	this.id=id;
	this.grade=grade;
	
}
public String toString()
{
	return this.id+" "+this.grade;
}
public static void main(String[] args) {
	Employee e1=new Employee(123,'A');
	System.out.println(e1);
}
}
