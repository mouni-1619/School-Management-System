package org.StreamPractise.com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmpList {
	static List<Emp> getList(){
		List<Emp>l=Arrays.asList(new Emp(1, "Alice", "Engineering", "Manager", 35, 10, 120000, 9, false,
                LocalDate.of(2022, 1, 10)),new Emp(2, "Bob", "Marketing", "Manager", 40, 5, 95000, 7, false,
                        LocalDate.of(2020, 5, 15)),new Emp(3, "Charlie", "Engineering", "Developer", 30, 8, 85000, 6, false,
                                LocalDate.of(2015, 3, 20)),new Emp(4, "David", "Sales", "Salesperson", 45, 15, 60000, 8, false,
                                        LocalDate.of(2018, 7, 25)),new Emp(5, "Eve", "Marketing", "Manager", 32, 6, 115000, 8, false,
                                                LocalDate.of(2019, 10, 1)),new Emp(6, "Frank", "HR", "Recruiter", 29, 4, 75000, 6, false, LocalDate.of(2021,
                                                        12, 12)),new Emp(7, "Grace", "Engineering", "Developer", 26, 3, 70000, 7, false,
                                                                LocalDate.of(2020, 6, 30)),
				 new Emp(8, "Hank", "IT", "Support", 50, 20, 65000, 8, true, LocalDate.of(2005, 9,
			                14)),
			        new Emp(9, "Ivy", "Finance", "Analyst", 37, 12, 95000, 9, false, LocalDate.of(2016,
			                11, 4)),
			        new Emp(10, "Jack", "Engineering", "Manager", 48, 22, 130000, 10, false,
			                LocalDate.of(2010, 3, 7)),
			        new Emp(11, "Kate", "IT", "Developer", 27, 3, 80000, 8, false, LocalDate.of(2020,
			                2, 2)),
			        new Emp(12, "Leo", "Sales", "Salesperson", 34, 9, 50000, 5, true,
			                LocalDate.of(2017, 8, 18)),
			        new Emp(13, "Mia", "Marketing", "Executive", 31, 6, 90000, 7, false,
			                LocalDate.of(2018, 1, 23)),
			        new Emp(14, "Nina", "Engineering", "Developer", 28, 4, 75000, 7, false,
			                LocalDate.of(2019, 4, 19)),
			        new Emp(15, "Oscar", "Finance", "Manager", 43, 15, 110000, 6, false,
			                LocalDate.of(2017, 5, 29)),
			        new Emp(16, "Paul", "HR", "Manager", 39, 14, 120000, 9, false, LocalDate.of(2015,
			                6, 10)),
			        new Emp(17, "Quincy", "Sales", "Salesperson", 38, 11, 55000, 4, true,
			                LocalDate.of(2019, 9, 15)),
			        new Emp(18, "Rachel", "Marketing", "Analyst", 26, 2, 60000, 6, false,
			                LocalDate.of(2022, 11, 7)),
			        new Emp(19, "Steve", "Engineering", "Developer", 45, 20, 100000, 10, false,
			                LocalDate.of(2004, 12, 30)),
			        new Emp(20, "Tom", "IT", "Support", 29, 5, 65000, 7, true, LocalDate.of(2021, 7, 1)));
		return l;
	}

}
