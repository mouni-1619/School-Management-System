package org.StudentTask.com;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	static List<Student> getStudents(){
		List<Student>students=new ArrayList<Student>();
		 students.add(new Student("1", "Alice", "Computer Science", 20, 2, 3.8, 0));
	        students.add(new Student("2", "Bob", "Electrical Engineering", 21, 3, 3.6, 1));
	        students.add(new Student("3", "Charlie", "Mechanical Engineering", 22, 4, 3.7, 2));
	        students.add(new Student("4", "David", "Civil Engineering", 23, 1, 3.9, 0));
	        students.add(new Student("5", "Eva", "Mathematics", 19, 2, 3.5, 1));
	        students.add(new Student("6", "Frank", "Physics", 20, 3, 3.8, 0));
	        students.add(new Student("7", "Grace", "Chemistry", 21, 4, 3.6, 2));
	        students.add(new Student("8", "Hank", "Biology", 22, 1, 3.7, 1));
	        students.add(new Student("9", "Ivy", "Economics", 23, 2, 3.9, 0));
	        students.add(new Student("10", "Jack", "History", 19, 3, 3.5, 2));
	        students.add(new Student("11", "Kate", "Philosophy", 20, 4, 3.8, 1));
	        students.add(new Student("12", "Leo", "Political Science", 21, 1, 3.6, 0));
	        students.add(new Student("13", "Mia", "Sociology", 22, 2, 3.7, 1));
	        students.add(new Student("14", "Nina", "Anthropology", 23, 3, 3.9, 0));
	        students.add(new Student("15", "Oscar", "Psychology", 19, 4, 3.5, 2));
	        students.add(new Student("16", "Paul", "Art", 20, 1, 3.8, 1));
	        students.add(new Student("17", "Quincy", "Music", 21, 2, 3.6, 0));
	        students.add(new Student("18", "Rachel", "Theater", 22, 3, 3.7, 1));
	        students.add(new Student("19", "Sam", "Dance", 23, 4, 3.9, 0));
	        students.add(new Student("20", "Tina", "Literature", 19, 1, 3.5, 2));
		return students;
	}

}
