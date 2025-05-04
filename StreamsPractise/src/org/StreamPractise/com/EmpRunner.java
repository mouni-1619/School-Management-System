package org.StreamPractise.com;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpRunner {
	public static void main(String[] args) {
		List<Emp> employes=EmpList.getList();
		System.out.println("------All The Employees In The List-------------");
		System.out.println("Size of List is: "+employes.size());
		employes.forEach(e->System.out.println(e));
		
		System.out.println("--Filter out all employees who are managers and have a salary greater than 100,000, but have\r\n"
				+ "joined in the last 4 years--");
		List<Emp> fiterOut= employes.stream().filter(e->(e.getJobTitle().equalsIgnoreCase("manager") && e.getSalary()>100000 && e.getDateOfJoining().isAfter(LocalDate.now().minusYears(4)))).collect(Collectors.toList());
		System.out.println("Size of List is: "+fiterOut.size());
		fiterOut.forEach(e->System.out.println(e));
		System.out.println("--Sort the remaining employees in descending order of their years of\r\n"
				+ "experience, and then by their performance ratings in ascending order--");
		List<Emp> sortingRemain=employes.stream().filter(e->!(e.getJobTitle().equalsIgnoreCase("manager") && e.getSalary()>100000 && e.getDateOfJoining().isAfter(LocalDate.now().minusYears(4)))).sorted(Comparator.comparingInt(Emp::getYearsOfExperience).reversed().thenComparing(Emp::getPerformanceRating)).collect(Collectors.toList());
		System.out.println("Size of List is: "+sortingRemain.size());
		sortingRemain.forEach(e->System.out.println(e));
		System.out.println("--Return a new list\r\n"
				+ "containing the names of the remaining employees in uppercase--");
		List<String> employeeNames=employes.stream().filter(e->!(e.getJobTitle().equalsIgnoreCase("manager") && e.getSalary()>100000 && e.getDateOfJoining().isAfter(LocalDate.now().minusYears(4)))).sorted(Comparator.comparingInt(Emp::getYearsOfExperience).reversed().thenComparing(Emp::getPerformanceRating)).map(e->e.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println("Size of List is: "+employeeNames.size());
		System.out.println(employeeNames);
	}

}
