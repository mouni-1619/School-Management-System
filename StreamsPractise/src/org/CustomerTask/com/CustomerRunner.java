package org.CustomerTask.com;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CustomerRunner {
	
	public static void main(String[] args) {
		Map<String , Customer>customermap=CustomerMap.getMap();
		System.out.println("========++++++++++--------TASK 1--------++++++++++========");
		System.out.println("--Filter out all customers who have a balance less than the average balance of all customers--");
		 double averageBalance = customermap.values().stream()
	                .mapToDouble(Customer::getBalance)
	                .average()
	                .orElse(0);
		 System.out.println("AverageBalence :"+averageBalance);
		 List<Customer>filtered=customermap.values().stream().filter(c -> c.getBalance() < averageBalance).collect(Collectors.toList());
		 filtered.forEach(e->System.out.println(e));
		 System.out.println("--Calculate the total years of membership of the remaining customers.--");
		
		 int totalYears = filtered.stream()
	                .mapToInt(Customer::getYearsOfMembership)
	                .sum();
		 System.out.println("TotalYears: "+totalYears);
		 System.out.println("--Find the customer with the highest years of membership and return their details.--");
		 Customer mostLoyal = filtered.stream()
	                .max(Comparator.comparingInt(Customer::getYearsOfMembership))
	                .orElse(null);
		 System.out.println("MostLoyal Customer : "+mostLoyal);
		 System.out.println("========++++++++++--------TASK 2--------++++++++++========");
		 System.out.println("--Filter out all customers who have joined in the last 3 years and have a loyalty score less than 4, but have a balance between 2000 and 5000.--");
		 Map<String , Customer>customermap1=CustomerMap.getMap();
		 List<Customer> filteredcoster = customermap1.values().stream()
	                .filter(c -> c.getYearsOfMembership() <= 3)
	                .filter(c -> c.getLoyaltyScore() < 4)
	                .filter(c -> c.getBalance() >= 2000 && c.getBalance() <= 5000)
	                .collect(Collectors.toList());
		 System.out.println("--Calculate the sum of the balances of the remaining customers, but only for those who have an even age.--");
		 double sumBalanceEvenAge = filtered.stream()
	                .filter(c -> c.getAge() % 2 == 0)
	                .mapToDouble(Customer::getBalance)
	                .sum();

	        System.out.println("Sum of balances (even age): " + sumBalanceEvenAge);
	        System.out.println("--Find the average age of the remaining customers, but only if their country has more than 10 customers.--");
	        Map<String, Long> countryCount = customermap1.values().stream()
	                .collect(Collectors.groupingBy(Customer::getCountry, Collectors.counting()));

	        List<Customer> countryFiltered = customermap1.values().stream()
	                .filter(c -> countryCount.getOrDefault(c.getCountry(), 0L) > 10)
	                .collect(Collectors.toList());

	        double avgAge = countryFiltered.stream()
	                .mapToInt(Customer::getAge)
	                .average()
	                .orElse(0);

	        System.out.println("Average age (countries with >10 customers): " + avgAge);
	}

}
