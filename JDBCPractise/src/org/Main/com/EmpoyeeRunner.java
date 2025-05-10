package org.Main.com;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.JDBCDao.com.EmpoyeeDao;
import org.JDBCDto.com.Employee;

public class EmpoyeeRunner {
public static void main(String[] args) {
	EmpoyeeDao dao=new EmpoyeeDao();
     
	Scanner scn=new Scanner(System.in);
	int choice;
         do {
        	 System.out.println("\n=== Menu ===");
             System.out.println("1. Create Employee Table");
             System.out.println("2. Insert Employee");
             System.out.println("3. View Employee");
             System.out.println("4. Exit");
             System.out.println("5. Update Employee Age");
             System.out.print("Enter your choice: ");
             choice = scn.nextInt();
             scn.nextLine(); 
         switch (choice) {
     	case 1: {
     		 dao.creatEmployee();
             break;

     	}
     	case 2:{
     		System.out.println("Enter the name of Employee");
     		String name=scn.next();
     		System.out.println("Enter the jobTitle");
     		String job=scn.next();
     		System.out.println("Enter the age");
     		int age=scn.nextInt();
     		System.out.println("Enter the Salary");
     		double sal=scn.nextDouble();
     		Employee e=new Employee( name, job, age, sal);
     		 dao.insertEmployee(e);
             break;
     	}
     	case 3:{
     		List<Employee>emplist=dao.getAllEmployees();
     		for(Employee e:emplist) {
     			System.out.println(e);
     		}
             break;
     	}
     	case 4:{
     		 System.out.println("Exiting...");
             break;
     	}
     	case 5:{
     		System.out.println("Enter the  employee id to wich can be update");
     		int id=scn.nextInt();
     		System.out.println("Enter the Employee udgated Age");
     		int age=scn.nextInt();
     		dao.updateEmployeeAge(id,age);
     		break;
     	}
     	default:
     		throw new IllegalArgumentException("Unexpected value: " +choice);
     	}
        
         } while (choice != 4);
       
}
}
