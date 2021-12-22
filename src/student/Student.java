package student;
import java.util.Random;

public class Student extends StudentDatabase{
	String studentName;
    private int staticId;
	String emailId;
	static int counter = 1;
	String SSN;
	String userId;
	private String state;
	private String city;
	private String phone;
	int balance;
	
	static String course;
	String[] courses = {"maalaus", "taide", "matematiikka", "musiikki"};	
	
	
	public Student(String name, String ssn) {
		this.studentName = name;
		this.SSN = ssn;
		this.emailId = studentName + "@edu.com";
		this.setStaticId(Student.counter++);
		int randomNumber = new Random().nextInt(9000) + 1000;
		this.userId = String.valueOf(staticId) + String.valueOf(randomNumber) + SSN.substring(SSN.length()-4);
		
	
		
		
	}

public String enroll(String join) {
	if (join == "yes") {
			return "Yes";
	}
			else  { 
				return "no";
			
	}
}

public int pay(int payment) {
	balance = balance - payment;
	return balance;
	
}

public int checkBalance() {
	return balance;
}

public String showCourses() {
	
	for (int i = 0; i < courses.length ; i++) {
		System.out.println(courses[i]);
		
		
	}
	return "";
	
}

@Override
	public String toString() {
	return studentName + " " + getStaticId() + " " + SSN + " " + emailId + " " + userId + " " + city;
	
	}




	public int getStaticId() {
		return staticId;
	}



	public void setStaticId(int staticId) {
		this.staticId = staticId;
	}








	public String getState() {
		return state;
	}








	public void setState(String state) {
		this.state = state;
	}








	public String getCity() {
		return city;
	}








	public void setCity(String city) {
		this.city = city;
	}








	public String getPhone() {
		return phone;
	}








	public void setPhone(String phone) {
		this.phone = phone;
	}



	

}
