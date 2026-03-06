package BasicPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDetails implements Comparable<StudentDetails> {
	
	private int id;
	private String name;
	private int age;
	private int marks;
	
	
	public StudentDetails(int id, String name, int age, int marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks =marks;
	}

//	@Override
//	public int compareTo(StudentDetails o) {
//		return this.age - o.age;
//	}
	
	@Override
	public int compareTo(StudentDetails o) {
		return this.marks - o.marks;
	}
	
	public static void main(String[] args) {
		List<StudentDetails> details = new ArrayList<>();
		details.add(new StudentDetails(1, "vignesh", 27, 450));
		details.add(new StudentDetails(2, "Kumar", 25, 430));
		
		Collections.sort(details);
		
		for(StudentDetails details2: details) {
			System.out.println("Name"+ details2.name + "age" + details2.age);
		}
	}

}
