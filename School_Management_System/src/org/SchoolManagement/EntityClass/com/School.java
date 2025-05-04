package org.SchoolManagement.EntityClass.com;

import java.util.Arrays;
import java.util.List;

public class School {
	private int sid;
	private String sname;
	private long[] schoolP_no;
	private List<Student> Students;
	private List<Teacher> teachers;
	private List<Parent> parents;
	private Addres addres;
	
	public School(int sid, String sname, long[] schoolP_no, List<Student> students, List<Teacher> teachers,
			List<Parent> parents, Addres addres) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.schoolP_no = schoolP_no;
		Students = students;
		this.teachers = teachers;
		this.parents = parents;
		this.addres = addres;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public long[] getSchoolP_no() {
		return schoolP_no;
	}
	public void setSchoolP_no(long[] schoolP_no) {
		this.schoolP_no = schoolP_no;
	}
	public List<Student> getStudents() {
		return Students;
	}
	public void setStudents(List<Student> students) {
		Students = students;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public List<Parent> getParents() {
		return parents;
	}
	public void setParents(List<Parent> parents) {
		this.parents = parents;
	}
	public Addres getAddres() {
		return addres;
	}
	public void setAddres(Addres addres) {
		this.addres = addres;
	}
	
}
