package BasicPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice {
	
	private int id;
	private String name;
	private int age;
	private int marks;
	
	public ComparatorPractice(int id, String name, int age, int marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks =marks;
	}
	

	
	
	public static void main(String[] args) {
		
		
		
		Comparator<ComparatorPractice> ageComparator = new Comparator<ComparatorPractice>() {
			
			@Override
			public int compare(ComparatorPractice o1, ComparatorPractice o2) {
				return o1.age - o2.age;
			}
		};
		
//	Comparator<ComparatorPractice> markComparator = new Comparator<ComparatorPractice>() {
//			
//			@Override
//			public int compare(ComparatorPractice o1, ComparatorPractice o2) {
//				return o1.marks - o2.marks;
//			}
//		};
		
		//simplified version of before mark comparator
	Comparator<ComparatorPractice> markComparator = (a, b) -> a.marks - b.marks;
		
		List<ComparatorPractice> details = new ArrayList<>();
		details.add(new ComparatorPractice(1, "vignesh", 27, 450));
		details.add(new ComparatorPractice(2, "kumar", 25, 430));
		
//		Collections.sort(details, ageComparator);
//		Collections.sort(details, markComparator);
		
		//asc order
		
		Collections.sort(details, (a, b) -> a.age - b.age);
		
		//DESC order
		Collections.sort(details, (a, b) -> b.age - a.age);
		
		for(ComparatorPractice comparatorpractice: details) {
			System.out.println("name" + "" + comparatorpractice.name + " " + "age" + comparatorpractice.age);
		}
	
	}

}
