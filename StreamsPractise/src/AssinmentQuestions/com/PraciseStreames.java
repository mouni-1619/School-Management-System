package AssinmentQuestions.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PraciseStreames {
	public static void main(String[] args) {
		System.out.println("---1 Filter all even numbers from a list of integers.-----");
		List<Integer> numbers=List.of(1,2,3,4,5,6,7,8);
		List<Integer> evennumbers=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println("origenal list "+numbers);
		System.out.println("Even elements of existing list is:");
		evennumbers.forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println("---2 Convert a list of strings to uppercase.-----");
		List<String> name=List.of("Mounika","Sindhu","hari","Arish","Adhi");
		List<String> UpperCasenames=name.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println("List name :"+name);
		System.out.println("UpperCaseNames : "+UpperCasenames);
		System.out.println("---3 Count the number of strings that start with the letter \"A\"..-----");
		long count= name.stream().filter(s->s.charAt(0)=='A').count();
		System.out.println("Count of String strats with A :"+count);
		System.out.println("---4 Find the maximum number from a list of integers..-----");
		Optional<Integer> maxNumber=numbers.stream().max(Integer::compareTo);
		maxNumber.ifPresent(n->System.out.println("Maxmum value present in list is: "+n));
		System.out.println("---5 Get the first element from a list of strings, if present...-----");
		Optional<String> fistElement=name.stream().findFirst();
		fistElement.ifPresent(s->System.out.println("Fist element in string :"+s));
		System.out.println("---6 Find the average of a list of integers..-----");
		double average=numbers.stream().collect(Collectors.averagingInt(n->n));
		System.out.println("Average Value of List of integer :"+average);
		System.out.println("-----7 Sort a list of strings in reverse order.--------");
		List<String> namesInReveseOrder=UpperCasenames.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Reverse order :"+namesInReveseOrder);
		System.out.println("-------8 Remove duplicate elements from a list of integers.---------");
		List<Integer> Dupicatenumbers=List.of(1,2,3,4,5,1,7,8,3,3,5);
		List<Integer> removeDuplicates=Dupicatenumbers.stream().distinct().collect(Collectors.toList());
		System.out.println("With out Duplicates List is :"+removeDuplicates);
		System.out.println("-----9 Skip the first 2 elements and limit to next 3 from a list-----");
		List<Integer> SkipFist2Elements=removeDuplicates.stream().dropWhile(n->n<3).limit(3).collect(Collectors.toList());//interdused in java 9 dropWhile()
		System.out.println(" Except fist to element remaing list use dropWhile()for skiping:"+SkipFist2Elements);
		//we can use another way also 
		List<Integer> SkipFist2Elements1=removeDuplicates.stream().skip(2).limit(3).collect(Collectors.toList());
		System.out.println(" Except fist to element remaing list use skip()for skiping :"+SkipFist2Elements1);
		System.out.println("-----10 Join all strings in a list using a comma delimiter.--------");
		StringBuilder names=UpperCasenames.parallelStream().collect(StringBuilder::new, (x,y)->x.append(y), (a,b)->a.append(",").append(b));
		System.out.println("Names are :"+names.toString());
		System.out.println("-------11 Convert a list of strings to a list of their lengths.----------");
		List<Integer> nameLengths=name.stream().map(s->s.length()).collect(Collectors.toList());
		System.out.println("Lengst of strings is :"+nameLengths);
		System.out.println("-----12 Flatten a list of list of integers into a single list.-----");
		List<Integer> l1=List.of(1,2,3,4,5,6,7,8);
		List<Integer> l2=List.of(1,2,3,0,7,8);
		List<Integer> l3=List.of(1,2,30,4,50,6,7,8,90);
		List<List<Integer>> list=Arrays.asList(l1,l2,l3);
		List<Integer> newList=list.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(newList.size());
		System.out.println("Flatten single list :"+newList);
		List<Integer> withOutDuplicatesnewList=list.stream().flatMap(List::stream).distinct().collect(Collectors.toList());
		System.out.println(withOutDuplicatesnewList.size());
		System.out.println("Flatten single list with out Duplicates :"+withOutDuplicatesnewList);
		System.out.println("-----13 Get only numeric strings from a mixed list of strings.-----");
	    StringBuilder lengthString=name.stream().map(s->s.length()).collect(StringBuilder::new, (x,y)->x.append(y), (a,b)->a.append(",").append(b));
	    System.out.println("Numberes String of length of String in list : "+lengthString.toString());
	    System.out.println("-----14 Group integers by even and odd.--------");
	    Map<String, List<Integer>> grouped = numbers.stream()
	            .collect(Collectors.groupingBy(n -> (n % 2 == 0) ? "Even" : "Odd"));

	        System.out.println(grouped);
	    System.out.println("-----15 Count how many times each word appears in a list of words.------");
	    Map<String, Long> stringCunt=name.stream().collect(Collectors.groupingBy(word->word,Collectors.counting()));
        System.out.println("Each Word Count in List os Strings : "+stringCunt);
		System.out.println("----16 Find the sum of all even numbers in a list.--------");
		int EvenSum=numbers.stream().filter(n->n%2==0).mapToInt(Integer::intValue).sum();
		System.out.println("Even Number Sum is : "+EvenSum);
		System.out.println("----17 Filter palindromic strings from a list.-----");
		List<String> humanRelations=List.of("amma","Nanna","Akka","Anna");
		List<String> palendramicStrings=humanRelations.stream().filter(s->s.toLowerCase().equals(new StringBuilder(s.toLowerCase()).reverse().toString())).collect(Collectors.toList());
		System.out.println("Palendramic wordes in String list :"+palendramicStrings);
		System.out.println("----18 Find duplicate elements in a list.-----");
		List<Integer>dupicates=Dupicatenumbers.stream().collect(Collectors.groupingBy(e->e,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Duplicates elements in the list is: "+dupicates);
		//we can find by creating set also this way
		Set<Integer>news=new HashSet<Integer>();
		Set<Integer> duplicateSet=Dupicatenumbers.stream().filter(n->!news.add(n)).collect(Collectors.toSet());
		System.out.println("Duplicates elements in the list is bu creating set: "+duplicateSet);
		System.out.println("----19 Partition integers based on whether they are greater than 50.----");
		List<Integer> part=List.of(10,20,50,55,70,33,45,51,90);
		Map<Boolean, List<Integer>> partitions=part.stream().collect(Collectors.partitioningBy(n->n>50,Collectors.toList()));
		System.out.println("Grater than 50 values in list");
		partitions.get(true).forEach(e->System.out.print(e+" "));
		System.out.println();
		System.out.println("Less than 50 values in list");
		partitions.get(false).forEach(e->System.out.print(e+" "));
		System.out.println();
		System.out.println("-----20 Check if any number in a list is divisible by 5.");
		Map<Boolean, List<Integer>> divisableby5=part.stream().collect(Collectors.partitioningBy(n->n%5==0,Collectors.toList()));
		System.out.println("Divisible by 5 is :");
		divisableby5.get(true).forEach(e->System.out.print(e+" "));
		System.out.println();
		System.out.println("Not Divisible by 5 is :");
		divisableby5.get(false).forEach(e->System.out.print(e+" "));
		System.out.println();
		
	}

}
