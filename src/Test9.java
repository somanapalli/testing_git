
//implementation class for i1 interface 
public class Test9 implements i1{

	@Override
	public void sum(int x, int y) {
		System.out.println("sum is: " +(x+y));
		
	}

	@Override
	public void sub(int x, int y) {
		System.out.println("sub is: " + (x-y));
	}

}
