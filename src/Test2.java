//demo on post increment&decrement and pre increment and decrement operators
public class Test2 {

	public static void main(String[] args) {

		//implicit casting done by the java compiler automatically -widening type casting
		int x=200;
		double y = x;
		System.out.println("double value is: " + y);
		
		//explicit casting done by programmer -narrowing type casting
		int z = (int)y;
		System.out.println("integer value is: "  + z);
		
	}
}
//for implicit type casting 
//byte->short->char->int ->long->float->double

