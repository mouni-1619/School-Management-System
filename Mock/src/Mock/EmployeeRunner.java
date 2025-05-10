package Mock;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//Filter out all employees who have less than 3 years of experience and are not in the IT department, but have a performance rating of at least 8.
//Sort the remaining employees in descending order of their performance ratings, and then by their years of experience in ascending order.
//Return a new list containing the names of the remaining employees, but with each name reversed, in lowercase, and suffixed with their age.

public class EmployeeRunner {
	
public static void main(String[] args) {
	List<Employee> employess=EmployeeList.getListOfEmployes();
	List<Employee> filter=employess.stream().filter(e->(e.getYearsOfExperience()<3&&!(e.getDepartment().equalsIgnoreCase("IT"))&&e.getPerformanceRating()>=8)).
			collect(Collectors.toList());
	System.out.println(filter.size());
    List<Employee> remaining=employess.stream().filter(e->!(e.getYearsOfExperience()<3&&!(e.getDepartment().equalsIgnoreCase("IT"))&&e.getPerformanceRating()>=8)).
			collect(Collectors.toList());
	System.out.println(remaining.size());
	List<Employee>sorted=remaining.stream().sorted(Comparator.comparing(Employee::getPerformanceRating,Comparator.reverseOrder()).
			thenComparing(Employee::getYearsOfExperience)).collect(Collectors.toList());
	sorted.forEach(e->System.out.println(e));
	
	List<String> name=sorted.stream().map(e->new StringBuffer(e.getName()).reverse().toString().toLowerCase()+e.getAge()).collect(Collectors.toList());
	name.forEach(e->System.out.println(e));
		
	
	
}
}
