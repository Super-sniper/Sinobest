package Mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Child {
	public String grade;
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(10));
		students.add(new Student(18));
		students.add(new Student(15));
		Collections.sort(students);
		System.out.print(students.get(1).age);
		//Person person = new Child();
		//System.out.println(person.name);
	}
}


class Student implements Comparable<Student> {
	Integer age;
	public Student(Integer age) {
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.age.compareTo(this.age);
	}

	//	@Override
	//	public int compareTo(Student o){
	//		//return o.age.compareTo(this.age);
	//  	}
}