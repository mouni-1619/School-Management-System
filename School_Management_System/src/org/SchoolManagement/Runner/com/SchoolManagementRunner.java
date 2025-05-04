package org.SchoolManagement.Runner.com;

import java.util.Arrays;

import org.SchoolManagement.EntityClass.com.Addres;
import org.SchoolManagement.EntityClass.com.FeeDetails;
import org.SchoolManagement.EntityClass.com.Parent;
import org.SchoolManagement.EntityClass.com.School;
import org.SchoolManagement.EntityClass.com.Student;
import org.SchoolManagement.EntityClass.com.Teacher;

public class SchoolManagementRunner {
	public static void main(String[] args) {
		Addres a1=new Addres("Keuthivennu", "Andhra Pradesh", 521324);
		Addres a2=new Addres("Kommi", "Andhra Pradesh",524239);
		Addres a3=new Addres("Kavali", "Andhra Pradesh", 524201);
		FeeDetails fd1=new FeeDetails(50000, 20000);
		FeeDetails fd2=new FeeDetails(45000, 20000);
		Parent p1=new Parent(1, "Venkateswarulu", 111122223334l, 1234567890, "venkey@gmail.com", a2, null);
		Parent p2=new Parent(2, "Nageswara Rao", 111122223333l, 1234567899, "jasthi@gmail.com", a1, null);
		Teacher t1=new Teacher(1, "Hema", 1111222333344l, 2012345678, "hema@gmail.com", a1, Arrays.asList("Maths","English","Telugu"));
		Teacher t2=new Teacher(2, "Arish", 1110222233333l, 3033445569l, "arish@gmail.com", a3,  Arrays.asList("Science","English","Social"));
		Student s1=new Student(1, "mounika", 111222333440l, 1234567890, "mouni@gmail.com", a2, 14, "ninth", p1, fd1);
		Student s2=new Student(2, "Vahini", 222333444110l, 5556667770l, "vahini@gmail.com", a1, 11, "seventh", p2, fd2);
		p1.setS(s1);
		p2.setS(s2);
		long[]SchollM_no= {9440450119l};
		School school1=new School(1, "Viswasanthi High School",SchollM_no, Arrays.asList(s1,s2),  Arrays.asList(t1,t2), Arrays.asList(p1,p2), a3);
	}
}
