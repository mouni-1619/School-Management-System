package AssinmentQuestions.com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.StreamPractise.com.Emp;
import org.StudentTask.com.Student;
import org.StudentTask.com.StudentList;

//import AssinmentQuestions.com.Employee;
public class EmployeRunner {
	public static void main(String[] args) {
		List<Employee>employees=EmployeeList.getListOfEmployes();
		System.out.println("----21 Create Employee class and get names of all employees in the \"IT\" department.---- ");
		//creatinfg map and use groupBy()
		Map<Boolean, List<String>> mapingByDept=employees.stream().collect(Collectors.groupingBy(e->e.getDepartment().equals("IT"), Collectors.mapping(Employee::getName, Collectors.toList())));
		System.out.println(mapingByDept);
		System.out.println("Depatment IT Employee names: ");
		mapingByDept.get(true).forEach(e->System.out.print(e+" "));
		System.out.println();
		//creating directly list use filter()
		List<String> filtering=employees.stream().filter(e->e.getDepartment().equalsIgnoreCase("IT")).map(Employee::getName).collect(Collectors.toList());
		filtering.forEach(e->System.out.print(e+" "));
		System.out.println(" - Employe Names in IT Department");
		//Creating List Useing mapping() and crating unmodifiead list
		List<String> l=employees.stream().filter(e->"it".equalsIgnoreCase(e.getDepartment())).collect(Collectors.collectingAndThen(Collectors.mapping(Employee::getName,Collectors.toList()),Collections::unmodifiableList));
		System.out.println(l);
		System.out.println("----22 Get list of employee names in uppercase.---- ");
		List<String> empnames=employees.stream().map(e->e.getName().toUpperCase()).collect(Collectors.toList());
		System.out.println("All Employees names in upper Case :");
		System.out.println(empnames);
		System.out.println("---23 Get average salary of all employees.---- ");
		double AverageSal=employees.stream().collect(Collectors.averagingDouble(e->e.getSalary()));
		System.out.println("Average salary of "+employees.size()+" Employes is "+AverageSal);
		System.out.println("---24 Get names of employees whose salary is greater than 50,000----");
		Map<Boolean, Set<String>> setOfEname=employees.stream().collect(Collectors.partitioningBy(e->e.getSalary()>50000,Collectors.mapping(Employee::getName, Collectors.toSet())));
		System.out.println(setOfEname.get(true));
		System.out.println(setOfEname.get(false));
		System.out.println("---25 Sort employees by salary in descending order.");
		List<Employee> descendingOrder=employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		descendingOrder.forEach(e->System.out.println(e));
		System.out.println("---26 Count employees in each department.---");
		
		Map<String, Long> countEmpinDept=employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting()));
		System.out.println(countEmpinDept);
		System.out.println("---27 Group employees by departmen");
		Map<String, List<Employee>> creatingmapBasedonDept=employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.mapping(e->e,Collectors.toList())));
		System.out.println("Employee Dept and thir Respatve empid list");
		creatingmapBasedonDept.forEach((dep,emplist)->{
			System.out.println("Demartment name :"+dep);
			emplist.forEach(e->System.out.println(e));
		});
		System.out.println("---28 Get the employee with the highest salary.----");
		Optional<Employee> e=employees.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));		
		e.ifPresent(System.out::println);
		System.out.println("---29 Get a list of departments without duplicates.----");
		List<String> depwithoutduplicate=employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		System.out.println(depwithoutduplicate);
	    System.out.println("---30 Get a map of employee ID to name.----");
	    Map<Integer, String> mapforIDandName=employees.stream().collect(Collectors.toMap(Employee::getEmployeeId, Employee::getName));
	    mapforIDandName.forEach((key,m)->System.out.println("Emp ID:"+key+" Emp name :"+m));
	    System.out.println("---31 Get names of employees older than 30, joined as a comma-separated string.--");
	    String older30ageemp=employees.stream().filter(emp->emp.getAge()>30).map(Employee::getName).collect(Collectors.joining(","));
	    System.out.println(older30ageemp);
	    System.out.println("---32 Get list of employees whose name starts with \"A\".");
	    List<String> StartA=employees.stream().filter(emp->emp.getName().charAt(0)=='A').map(Employee::getName).collect(Collectors.toList());
	    System.out.println(StartA);
	    System.out.println("---33 Get total salary of all employees in \"HR\" department.");
	    double AvgSalOfHR=employees.stream().filter(emp->emp.getDepartment().equalsIgnoreCase("HR")).collect(Collectors.averagingDouble(Employee::getSalary));
	    System.out.println(AverageSal+" of HR department Employes");
	    System.out.println("---34 Get all employee names with length greater than 5 characters.---");
	    List<Employee> nameLengrater5=employees.stream().filter(a->a.getName().length()>5).collect(Collectors.toList());
	    nameLengrater5.forEach(a->System.out.println(a));
	    System.out.println("---35 Find any employee in \"Finance\" department.---");
	    List<Employee> empinFinance=employees.stream().filter(a->a.getDepartment().equalsIgnoreCase("Finance")).collect(Collectors.toList());
	    empinFinance.forEach(a->System.out.println(a));
	    System.out.println("---36 Get a list of all employee IDs sorted in ascending order.---");
	    List<Integer> EmpIdinasending=employees.stream().sorted(Comparator.comparingInt(Employee::getEmployeeId)).map(Employee::getEmployeeId).collect(Collectors.toList());
	    System.out.println(EmpIdinasending);
	    System.out.println("---37 Partition employees by age greater than or less than 40.---");
	    Map<Boolean, List<Employee>> partitionByAge40=employees.stream().collect(Collectors.partitioningBy(a->a.getAge()>40));
	    System.out.println("Age is grater than 40");
	    partitionByAge40.get(true).forEach(System.out::println);
	    System.out.println("Age is less than 40");
	  
	    partitionByAge40.get(false).forEach(System.out::println);
	    System.out.println("---38 Find employee names having the second-highest salary.---");
	    Map<Double, List<Employee>> mapSal=employees.stream().collect(Collectors.groupingBy(Employee::getSalary));
	    List<Double> sallist=new ArrayList<Double>(mapSal.keySet());
	    Collections.sort(sallist, Comparator.reverseOrder());
	    if(sallist.size()<2) {
	    	System.out.println(" No Secont largest value is posible");
	    	return;
	    }
	    double secondSalry=sallist.get(1);
	    List<String> secondHSalEmp=mapSal.get(secondSalry).stream().map(Employee::getName).collect(Collectors.toList());
	    secondHSalEmp.forEach(ea->System.out.println(ea));
	    System.out.println("---39 Get list of employee names whose salary is between 50,000 and 1,00,000.---");
	    List<String> between50to100=employees.stream().filter(a->a.getSalary()>50000&&a.getSalary()<100000).map(Employee::getName).collect(Collectors.toList());
	    System.out.println(between50to100);//13 emps
	    System.out.println("---40 Create a map of department to list of employee names.----");
	    Map<String , List<String>> deptandNames=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName, Collectors.toList())));
	    System.out.println(deptandNames);
	    System.out.println("-----Task1 For Emplyee");
	    System.out.println("Filter out all employees who are managers and have a salary greater than 100,000, but have joined in the last 3 years. Sort the remaining employees in descending order of their years of experience, and then by their performance ratings in ascending order. Return a new list containing the names of the remaining employees in uppercase.");
	    List<String> task1=employees.stream().filter(a->!(a.getJobTitle().equalsIgnoreCase("Manager")&&a.getSalary()>100000&&a.getDateOfJoining().isAfter(LocalDate.now().minusYears(4)))).sorted(Comparator.comparing(Employee::getDateOfJoining,Comparator.reverseOrder()).thenComparing(Employee::getPerformanceRating)).map(Employee::getName).collect(Collectors.toList());
	    System.out.println(task1.size());
	    System.out.println(task1);
	    System.out.println("----Task2----------");
	    System.out.println("Filter out all employees who have joined in the last 5 years and have a performance rating of less than 8, but have a salary between 60,000 and 120,000. Sort the remaining employees inascending order of their salaries, and then by their years of experience in descending order.Return a new list containing the IDs of the remaining employees.");
	    List<Integer> task2=employees.stream().filter(a->!(a.getDateOfJoining().isAfter(LocalDate.now().minusYears(4))&& a.getPerformanceRating()<8&&(a.getSalary()>60000&&a.getSalary()<120000))).sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getYearsOfExperience,Comparator.reverseOrder())).map(Employee::getEmployeeId).collect(Collectors.toList());
	    System.out.println(task2.size());
	    System.out.println(task2);
	    System.out.println("------Student task1----------");
	    List<Student> students=StudentList.getStudents();
	    System.out.println("Group the students by their major into a Map where the key is the major and the value is a set of students in that major, but only for majors with more than 5 students and an average GPA above 3.0.\r\n"
	    		+ "Sort the students within each major in ascending order of their GPA, and then by their age in descending order.\r\n"
	    		+ "Return the Map containing the grouped and sorted students.");
	    Set<Student>set=new HashSet<Student>(students);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	

}
