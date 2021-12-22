package student;

public class StudentDatabase {
	
	public static void main(String[] args) {
		
		Student student1 = new Student("Kukka", "250573");
		student1.setCity("Järvenpää");
		
		
	
		Student student2 = new Student("Kakka", "260573");
		
		System.out.println(student1);
		System.out.println(student2);
		
		student1.showCourses();
	}

}

