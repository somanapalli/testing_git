
public class Test1 {
	
	static int x = 100;
	//instance variable
	int y = 200;
	
	//non-static method
	public void display()
	{
		//instance area
		//System.out.println(Test1.x);
		//System.out.println(this.x);
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args) {
		
		//static area 
		Test1 obj  = new Test1();
	   obj.display();
		
		System.out.println(obj.y);
		
		
		
		
	}

}
