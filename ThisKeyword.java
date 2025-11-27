package module1programs;

public class ThisKeyword {

	int empid=19;
	double salary=33000.3;
	String name="ram";
	
	void employeeDetails(int empid,double salary,String name)
	{
		this.empid=empid;
		this.salary=salary;
		this.salary=salary;
		//System.out.println(empid+" "+ + salary+ " "+ name );
	}
	
	
	public static void main(String[] args) 
	{
		ThisKeyword t1= new ThisKeyword();
		t1.employeeDetails(100, 21.2, "laxman");
		System.out.println(t1.empid);
		System.out.println(t1.name);
		System.out.println(t1.salary);
	}

}
