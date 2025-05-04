package org.StudentTask.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StudentRuner {
	public static void main(String[] args) {
		Set<Student>students=new LinkedHashSet<Student>(StudentList.getStudents());
		System.out.println("Size of set: "+students.size());
		students.forEach(s->System.out.println(s));
		System.out.println("--Group the students by their major into a Map where the key is the major and the value is a set of students in that major--");
		Map<String, Set<Student>> majorStudents=students.stream().collect(Collectors.groupingBy(Student::getMajor,Collectors.toSet()));
		System.out.println("Size of set: "+majorStudents.size());
		System.out.println("--but only for majors with more than 5 students and an average GPA above 3.0.------");
		Map<String, Set<Student>> filteredStudents=majorStudents.entrySet().stream().filter(entry ->( entry.getValue().size() > 5&& entry.getValue().stream().mapToDouble(Student::getGpa)
		        .average().orElse(0.0) > 3.0) ).collect(Collectors.toMap( Map.Entry::getKey,
		        Map.Entry::getValue));
		System.out.println(filteredStudents.size());
	        }
	}


