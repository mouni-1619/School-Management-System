package org.StreamPractise.com;

import java.lang.classfile.instruction.StoreInstruction;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeRunner {
	public static void main(String[] args) {
//		  Scanner sc = new Scanner(System.in);
//	        List<Employee> employees1 = new ArrayList<Employee>();
//	        System.out.print("Enter number of employees: ");
//	        int n = Integer.parseInt(sc.nextLine());
//	        for (int i = 0; i < n; i++) {
//	        	System.out.println("\nEnter details for employee #" + (i + 1));
//	            System.out.print("Employee ID: ");
//	            int id = Integer.parseInt(sc.nextLine());
//	            System.out.print("Name: ");
//	            String name = sc.nextLine();
//	            System.out.print("Department: ");
//	            String department = sc.nextLine();
//	            System.out.print("Job Title: ");
//	            String jobTitle = sc.nextLine();
//	            System.out.print("Age: ");
//	            int age = Integer.parseInt(sc.nextLine());
//	            System.out.print("Years of Experience: ");
//	            int experience = Integer.parseInt(sc.nextLine());
//	            System.out.print("Salary: ");
//	            double salary = Double.parseDouble(sc.nextLine());
//	            System.out.print("Performance Rating (1-10): ");
//	            int rating = Integer.parseInt(sc.nextLine());
//	            System.out.print("Is Married (true/false): ");
//	            boolean isMarried = Boolean.parseBoolean(sc.nextLine());
//	            System.out.print("Date of Joining (yyyy-mm-dd): ");
//	            LocalDate joiningDate = LocalDate.parse(sc.nextLine());
//
//	            employees1.add(new Employee(id, name, department, jobTitle, age, experience,
//	                    salary, rating, isMarried, joiningDate));
//	        }
		List<Employee> employees=Arrays.asList(  new Employee(1, "Alice", "Engineering", "Manager", 35, 10, 120000, 9, false,
                LocalDate.of(2022, 1, 10)),
        new Employee(2, "Bob", "Marketing", "Manager", 40, 5, 95000, 7, false,
                LocalDate.of(2020, 5, 15)),
        new Employee(3, "Charlie", "Engineering", "Developer", 30, 8, 85000, 6, false,
                LocalDate.of(2015, 3, 20)),
        new Employee(4, "David", "Sales", "Salesperson", 45, 15, 60000, 8, false,
                LocalDate.of(2018, 7, 25)),
        new Employee(5, "Eve", "Marketing", "Manager", 32, 6, 115000, 8, false,
                LocalDate.of(2019, 10, 1)),
        new Employee(6, "Frank", "HR", "Recruiter", 29, 4, 75000, 6, false, LocalDate.of(2021,
                12, 12)),
        new Employee(7, "Grace", "Engineering", "Developer", 26, 3, 70000, 7, false,
                LocalDate.of(2020, 6, 30)),
        new Employee(8, "Hank", "IT", "Support", 50, 20, 65000, 8, true, LocalDate.of(2005, 9,
                14)),
        new Employee(9, "Ivy", "Finance", "Analyst", 37, 12, 95000, 9, false, LocalDate.of(2016,
                11, 4)),
        new Employee(10, "Jack", "Engineering", "Manager", 48, 22, 130000, 10, false,
                LocalDate.of(2010, 3, 7)),
        new Employee(11, "Kate", "IT", "Developer", 27, 3, 80000, 8, false, LocalDate.of(2020,
                2, 2)),
        new Employee(12, "Leo", "Sales", "Salesperson", 34, 9, 50000, 5, true,
                LocalDate.of(2017, 8, 18)),
        new Employee(13, "Mia", "Marketing", "Executive", 31, 6, 90000, 7, false,
                LocalDate.of(2018, 1, 23)),
        new Employee(14, "Nina", "Engineering", "Developer", 28, 4, 75000, 7, false,
                LocalDate.of(2019, 4, 19)),
        new Employee(15, "Oscar", "Finance", "Manager", 43, 15, 110000, 6, false,
                LocalDate.of(2017, 5, 29)),
        new Employee(16, "Paul", "HR", "Manager", 39, 14, 120000, 9, false, LocalDate.of(2015,
                6, 10)),
        new Employee(17, "Quincy", "Sales", "Salesperson", 38, 11, 55000, 4, true,
                LocalDate.of(2019, 9, 15)),
        new Employee(18, "Rachel", "Marketing", "Analyst", 26, 2, 60000, 6, false,
                LocalDate.of(2022, 11, 7)),
        new Employee(19, "Steve", "Engineering", "Developer", 45, 20, 100000, 10, false,
                LocalDate.of(2004, 12, 30)),
        new Employee(20, "Tom", "IT", "Support", 29, 5, 65000, 7, true, LocalDate.of(2021, 7, 1)));
		//Implement a program that reads a list of Employee objects from the user and performs the
		//following operations:
		//	Filter out all employees who are managers and have a salary greater than 100,000, but have
		//	joined in the last 3 years. Sort the remaining employees in descending order of their years of
		//	experience, and then by their performance ratings in ascending order. Return a new list
		//	containing the names of the remaining employees in uppercase.
		LocalDate three=LocalDate.now().minusYears(4);
		
		List<Employee> SortBySalEmp=employees.stream() .filter(e -> e.getJobTitle().equalsIgnoreCase("Manager")&&(e.getSalary() > 100000)&&e.getDateOfJoining().isAfter(three)).collect(Collectors.toList());
		System.out.println(employees.size());
		System.out.println(SortBySalEmp.size());
		SortBySalEmp.forEach(a->System.out.println(a.toString()));
		List<Employee> remove=employees.stream().filter(e->!SortBySalEmp.contains(e)).collect(Collectors.toList());
		System.out.println(remove.size());
		remove.forEach(e->System.out.println(e));
		Comparator<Employee> c=((e1, e2) -> {
		    int cmp = Integer.compare(e2.getYearsOfExperience(), e1.getYearsOfExperience()); 
		    if (cmp == 0) {
		        cmp = Integer.compare(e1.getPerformanceRating(), e2.getPerformanceRating());
		    }
		    
		    return cmp;
	});
		List<Employee> result=remove.stream() .sorted(c).collect(Collectors.toList());
		System.out.println(result.size());
		result.forEach(e->System.out.println(e));
		List<String> names=result.stream().map(e -> e.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println(names.size());
		System.out.println(names);
//		List<Employee> complet=new ArrayList<Employee>(employees);
//		complet.removeAll(SortBySalEmp);
//		System.out.println("------------------");
//		System.out.println(complet.size());
//		complet.forEach(a->System.out.println(a.toString()));
//		System.out.println(employees.size());
		
//		Comparator<Employee> c1=((e1, e2) -> {
//		    int cmp = Integer.compare(e2.getYearsOfExperience(), e1.getYearsOfExperience());
//		    if (cmp != 0) {
//		    	return cmp ;
//		    }
//		    
//		    return cmp = Integer.compare(e1.getPerformanceRating(), e2.getPerformanceRating());
//	});
//		Comparator<Employee> c3=((e1, e2) -> {
//			if(e1.getYearsOfExperience()!=e2.getYearsOfExperience()) {
//				return e2.getYearsOfExperience()-e1.getYearsOfExperience();
//			}else {
//				return e1.getPerformanceRating()- e2.getPerformanceRating();
//			}
//	});

		
//	   List<Employee>sorted=complet.stream().sorted(c).collect(Collectors.toList());
//		sorted.forEach(a->System.out.println(a.toString()));
//		List<String> result=employees.stream() .filter(e -> e.getJobTitle().equalsIgnoreCase("Manager"))
//                .filter(e -> e.getSalary() > 100000).filter(e->e.getYearsOfExperience()>3).sorted(c).map(e -> e.getName().toUpperCase()).collect(Collectors.toList());
//		System.out.println();
//		List<Employee> result1=employees.stream().filter(e -> e.getJobTitle().equalsIgnoreCase("Manager")&&(e.getSalary() > 100000)&&e.getDateOfJoining().isAfter(three)).sorted(c1).collect(Collectors.toList());
//		List<Employee> result1=complet.stream().sorted(c1).collect(Collectors.toList());
//		System.out.println("---------------final result--------------------------");
//		System.out.println(result1.size());
//		result1.forEach(a->System.out.println(a.toString()));
//		System.out.println("---------------final result--------------------------");
//		result.forEach(a->System.out.println(a.toString()));
//		System.out.println("?????????????????????????????????");
//		List<Employee> l=employees.stream().filter(e->e.getJobTitle().equalsIgnoreCase("Manager")).collect(Collectors.toList());	
//		l.forEach(a->System.out.println(a.toString()));
//		System.out.println("++++++++++++++++++++++++++++++++++++++");
//		List<Employee>l2=employees.stream().filter(e->e.getSalary()>100000).collect(Collectors.toList());
//		l2.forEach(a->System.out.println(a));
//		System.out.println("++++++++++----+++++++=====+++++++");
//		List<Employee>l3=l2.stream().sorted(c3).collect(Collectors.toList());
//		l3.forEach(a->System.out.println(a));
	}

}
