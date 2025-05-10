package org.JDBCDao.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.JDBCDto.com.Employee;

public class EmpoyeeDao {
	 String url = "jdbc:postgresql://localhost:5432/Employee";
     String user = "postgres";
     String password = "root";
     Connection conn=null;
     Statement stmt=null;
     public Connection getConnection() throws Exception {
         Class.forName("org.postgresql.Driver");
         conn= DriverManager.getConnection(url, user, password);
         return conn;
     }
     public void creatEmployee() {
    	 String creatTable = "CREATE TABLE IF NOT EXISTS employee (" +
                 "employeeId SERIAL PRIMARY KEY, " +
                 "name VARCHAR(50), " +
                 "jobTitle VARCHAR(50),"+
                 "age INT,"+
                 "salary NUMERIC(10, 2))";
    	 try {
			conn=DriverManager.getConnection(url, user, password);
			 stmt=conn.createStatement();
			stmt.executeQuery(creatTable);
			System.out.println("Table is created");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			try {
				conn.close();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
     }
     public void insertEmployee(Employee emp) {
    	 String insert="INSERT INTO employee(name,jobeTItle,age,salary) VALUS(?,?,?,?) ";
    	try( Connection con =DriverManager.getConnection(url, user, password);PreparedStatement pstmt=con.prepareStatement(insert)){
    		 pstmt.setString(1, emp.getName());
             pstmt.setString(2,emp.getJobTitle());
             pstmt.setInt(3, emp.getAge());
             pstmt.setDouble(4, emp.getSalary());
             pstmt.executeUpdate();
             System.out.println("Employee  inserted.");
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
     }
     public List<Employee> getAllEmployees() {
         List<Employee> list = new ArrayList();
         String sql = "SELECT * FROM employee";
         try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
             ResultSet rs = stmt.executeQuery(sql);
             while (rs.next()) {
                 Employee emp = new Employee();
                 emp.setEmployeeId(rs.getInt(1));
                 emp.setName(rs.getString(2));
                 emp.setJobTitle(rs.getString(3));
                 emp.setAge(rs.getInt(4));
                 emp.setSalary(rs.getDouble(5));
                 list.add(emp);
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return list;
     }
     public void updateEmployeeAge(int id,int newAge) {
    	 String updateAge="update employee set age=? where EmployeeId=?";
    	 try(Connection con=DriverManager.getConnection(url, user, password);PreparedStatement pstmt=con.prepareStatement(updateAge)){
    		pstmt.setInt(1,newAge);
    		pstmt.setInt(2, id);
    		int rs=pstmt.executeUpdate();
            if (rs > 0) {
                System.out.println("Employee age updated successfully.");
            } else {
                System.out.println("Employee not found with ID: " + id);
            }
    	 } catch (SQLException e) {
		
			e.printStackTrace();
		}
    
     }

}
