
public class Test6 {
	
	public void sum(int x, int y)
	{
		System.out.println("integer sum is: " +(x+y));
	}
	public void sum(double x, double y)
	{
		System.out.println("double sum is: " +(x+y));
	}
	
	public static void main(String[] args) {
		
		Test6 obj;//object declaration available at compile time to the java compiler
		obj= new Test6();//referencing the object at runtime 
		obj.sum(6, 7);
		obj.sum(8.9,4.5);
		
	}

}
