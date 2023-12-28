
public class Test8 {
	
	public static void main(String[] args) {
		
		Bank obj = new Icici();
		System.out.println("icici bank rate of interst is :" + obj.rateOfInterest());
		
		Bank obj1 = new SBI();
		System.out.println("SBI rate of interst is : "  + obj1.rateOfInterest());
	}

}
