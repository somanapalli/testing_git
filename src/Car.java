
public class Car {
	
	 String model;
	 Engine carEngine;//Car has-an Engine

	 public Car(String model,Engine carEngine)
	 {
		 this.model=model;
		 this.carEngine=carEngine;
		 
	 }
}
