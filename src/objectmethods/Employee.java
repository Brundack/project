package objectmethods;



public class Employee {
	int id;
	char grade;
	Employee(int id,char grade)
	{
		this.id=id;
		this.grade=grade;
		
	}
	public boolean equals(Object obj)
	{
		Employee e2=(Employee)obj;
		return(this.grade==e2.grade);
	}
	public static void main(String[] args) {
		Employee e1=new Employee(123,'A');
		Employee e2=new Employee(456,'B');
		System.out.println(e1.equals(e2));
	}
}
