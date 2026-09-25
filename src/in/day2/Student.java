package in.day2;

public class Student {
	String name="Vishwas";
	int age=10;
	char gender='m';
	
	void sleep() {
		System.out.println("Student is sleeping");
	}
	
	
	public static void main(String[] args) {
		Student s =new Student();
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.gender);
		System.out.println("HI");
		s.sleep();// method calling
		
	}
	
}
