package AssinmentQuestions.com;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.CustomerTask.com.Customer;
import org.CustomerTask.com.CustomerMap;

public class CustomerRunner {
	public static void main(String[] args) {
		System.out.println("-----Task 1 of Customer-------");
		System.out.println("Filter out all customers who have a balance less than the average balance of all customers.\r\n"
				+ "Calculate the total years of membership of the remaining customers.\r\n"
				+ "Find the customer with the highest years of membership and return their details.");
		Map<String, Customer> customers=CustomerMap.getMap();
		System.out.println(customers.size());
		double avgsBalence=customers.values().stream().
				collect(Collectors.averagingDouble(Customer::getBalance));
		List<Customer> filterdbylessBalthanavg=customers.values().stream().
				filter(e->e.getBalance()<avgsBalence).collect(Collectors.toList());
		System.out.println(filterdbylessBalthanavg.size());
		List<Customer> remaing=customers.values().stream().filter(e->e.getBalance()>=avgsBalence).
				collect(Collectors.toList());
		System.out.println(remaing.size());
		int totalyearsofexp=remaing.stream().mapToInt(Customer::getYearsOfMembership).sum();
		Customer c=customers.values().stream().max(Comparator.
				comparing(Customer::getYearsOfMembership)).orElse(null);
		System.out.println("All customers have less balence the "+avgsBalence+" list is this ");
		filterdbylessBalthanavg.forEach(e->System.out.println(e));
		System.out.println(" Total years of membership of remaining is "+totalyearsofexp);
		System.out.println("Customer having higher member ship");
		System.out.println(c);
		System.out.println("----Task 2----------");
		System.out.println("Filter out all customers who have joined in the last 3"
				+ " years and have a loyalty score less than 4,"
				+ " but have a balance between 2000 and 5000.\r\n"
				+ "Calculate the sum of the balances of the remaining customers,"
				+ " but only for those who have an even age.\r\n"
				+ "Find the average age of the remaining customers, "
				+ "but only if their country has more than 10 customers.");
		List<Customer> last3joing=customers.values().stream().
				filter(e->(e.getYearsOfMembership()<=3&&e.getLoyaltyScore()<4&&
				(e.getBalance()>2000&&e.getBalance()<4000))).collect(Collectors.toList());
		double sumofbal=customers.values().stream().filter(e->!(e.getYearsOfMembership()<=3&&e.getLoyaltyScore()<4&&
				(e.getBalance()>2000&&e.getBalance()<4000))).filter(e->e.getAge()%2==0).
				mapToDouble(Customer::getBalance).sum();
//		            Map<String, Long> cuntryCount=customers.values().stream().collect(Collectors.
//		            		groupingBy(Customer::getCountry,Collectors.counting()));
		            List<Customer> cust=customers.values().stream().
		    				filter(e->!(e.getYearsOfMembership()<=3&&e.getLoyaltyScore()<4&&
		    				(e.getBalance()>2000&&e.getBalance()<4000)))
		    			.collect(Collectors.toList());
		            List<String> countryCount =cust.stream()
			                .collect(Collectors.groupingBy(Customer::getCountry, Collectors.counting())).entrySet().stream().filter(e->e.getValue()>2).map(e->e.getKey()).toList();
			        					double avgage= cust.stream().filter(e->countryCount.contains(e.getCountry())).mapToInt(Customer::getAge).average().getAsDouble();
//		System.out.println(cust);
//		double avgage=cust.stream().collect(Collectors.averagingDouble(null))
		
	}

}
