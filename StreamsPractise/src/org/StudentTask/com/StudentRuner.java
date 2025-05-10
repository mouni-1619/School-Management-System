package org.StudentTask.com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
		System.out.println("/Filter out all students who have joined in the last 3 years and have a major in Mathematics, but have a GPA below 3.0 and are on academic probation.\r\n"
				+ "//Calculate the sum of the GPAs of the remaining students, but only for those who have an age above 22 and a GPA above the average GPA.\r\n"
				+ "//Find the average age of the remaining students, but only if their department has more than 10 students and an average GPA above 3.5.\r\n"
				+ "//Calculate the factorial of the average age, but only if the total years of enrollment of all students is greater than 30 and the average GPA is below 3.9.");
		//1
	List<Student>s=	students.stream().filter(e->(e.getYearsOfEnrollment()<=3&&e.getMajor().
			equalsIgnoreCase("Mathematics")&&(e.getGpa()<3.0)&&e.getNumberOfIncompleteCourses()==0)).collect(Collectors.toList());
	List<Student>s1=	students.stream().filter(e->!(e.getYearsOfEnrollment()<=3&&e.getMajor().
			equalsIgnoreCase("Mathematics")&&(e.getGpa()<3.0)&&e.getNumberOfIncompleteCourses()==0)).collect(Collectors.toList());
	
	double avg= s1.stream().mapToDouble(Student::getGpa).average().getAsDouble();
	double sum= s1.stream().filter(e->(e.getAge()>22&&e.getGpa()>avg)).mapToDouble(Student::getGpa).sum();
	  if(s1.size()>10) {
		  double avgs=s1.stream().mapToDouble(Student::getGpa).average().getAsDouble();
		  if(avgs>3.5) {
			  double sumage= s1.stream().mapToDouble(Student::getAge).average().getAsDouble(); 
			  System.out.println(sumage+"   3");
			  double total=s1.stream().mapToInt(Student::getYearsOfEnrollment).sum();
			  if(total>30&&avgs<3.9) {
				 
				long fag=factorial((int) avgs);
				System.out.println(fag+"   4");
			  }
		  }
	  }
	
	System.out.println(sum+"   2");
	
	
	        }
	static long factorial(int avgs) {
		return IntStream.rangeClosed(1, avgs).asLongStream().reduce(1,(a,b)->a*b);
	}
	}


