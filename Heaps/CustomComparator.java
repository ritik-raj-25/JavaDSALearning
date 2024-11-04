package Heaps;

import java.util.Arrays;
import java.util.Comparator;

class Student{
	private int rollNo;
	private String name;
	private double marks;
	
	public Student(int rollNo, String name, double marks) {
		this.rollNo = rollNo;
		this.name  = name;
		this.marks = marks;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public String getName() {
		return name;
	}
	public double getMarks() {
		return marks;
	}
}
 
class SortByName implements Comparator<Student> {
	public int compare(Student a, Student b) {
		//Ascending order
		return a.getName().compareTo(b.getName());	//For descending order return b.getName().compareTo(a.getName());
	}
}

class SortByRollNo implements Comparator<Student>{
	public int compare(Student a, Student b) {
		//Ascending order
		return a.getRollNo()-b.getRollNo();
	}
}

class SortByMarks implements Comparator<Student> {
	public int compare(Student a, Student b) {
		//Descending order
		return Double.compare(b.getMarks(), a.getMarks()); 
	}
}

public class CustomComparator {

	public static void main(String[] args) {
		Student[] s = new Student[4];
		s[0] = new Student(1,"Ritk Raj",97.3);
		s[1] = new Student(2,"Ankit Singh",95.3);
		s[2] = new Student(3,"Anshu Singh",96.3);
		s[3] = new Student(4,"Ananya Singh",98.3);
		System.out.println("Before Sorting:");
		for(Student stu : s) {
			System.out.println(stu.getRollNo()+" "+stu.getName()+" "+stu.getMarks());
		}
		
		Arrays.sort(s,new SortByName());
		System.out.println("After Sorting(sort by name):");
		for(Student stu : s) {
			System.out.println(stu.getRollNo()+" "+stu.getName()+" "+stu.getMarks());
		}
		
		Arrays.sort(s, new SortByRollNo());
		System.out.println("After Sorting(sort by rollNo):");
		for(Student stu : s) {
			System.out.println(stu.getRollNo()+" "+stu.getName()+" "+stu.getMarks());
		}
		
		Arrays.sort(s, new SortByMarks());
		System.out.println("After Sorting(sort by marks):");
		for(Student stu : s) {
			System.out.println(stu.getRollNo()+" "+stu.getName()+" "+stu.getMarks());
		}
	}

}
