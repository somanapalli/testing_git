
public class Employee {
	//class level variables
	int empid;
	String empname;
	
	//parameterized constructor
	public Employee(int empid, String empname)
	{
		
		this.empid=empid;
		this.empname=empname;
		displayEmployeeInfo();
	}
	
	//user defined default constructor
	public Employee()
	{
		//call the parameterized constructor of current class
		this(100,"rk");
		empid=200;
		empname="pavan";
	
	}
	
	
	//display the values
	
	public void displayEmployeeInfo() {
		System.out.println("employee id is:" + empid);
		System.out.println("employee name is:" + empname);
	}
	
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.displayEmployeeInfo();
		System.out.println("=============================");
		
		
		
	}

}
