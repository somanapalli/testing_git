public class Student {

	// variables
	int stid = 100;
	String stname = "ram";
	float stmarks = 99.5f;
	String staddress = "hyd";
	char stgrade = 'A';
	// common for multiple students
	static String collegeName = "jntu";

	// method to display the student information
	public void getStudentInformation() {
		System.out.println("student id is: " + stid);
		System.out.println("student name is: " + stname);
		System.out.println("student  marks are : " + stmarks);
		System.out.println("student address is:" + staddress);
		System.out.println("student grade is: " + stgrade);
	}

	// defining this main method
	public static void main(String[] args) {

		// create the object for Student class

		Student obj = new Student();

		System.out.println(collegeName);

	}

}
