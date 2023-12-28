
//execution logic class
public class Test5 {

	public static void main(String[] args) {
		
		//creating an Engine for a Car
		Engine v6Engine = new Engine("V6");
		
		//creating a Car with the Engine 
		Car myCar = new Car("Sedan",v6Engine);
		
		//accessing car properties
		System.out.println("Model -->" + myCar.model);
	    System.out.println("Engine Type -->" + myCar.carEngine.type);
	}
}
