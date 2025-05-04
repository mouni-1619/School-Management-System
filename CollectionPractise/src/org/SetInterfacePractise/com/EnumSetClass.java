package org.SetInterfacePractise.com;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetClass {
	public static void main(String[] args) {
		EnumSet<Day> workingDays=EnumSet.range(Day.MONDAY, Day.FRIDAY);
		EnumSet<Day> weekEnd=EnumSet.of(Day.SATURDAY, Day.SUNDAY);
		System.out.println("workingDays :"+workingDays);
		System.out.println("weekEnd :"+weekEnd);
		System.out.println("-----Adding saturSay to working day-------");
		workingDays.add(Day.SATURDAY);
		System.out.println("workingDays :"+workingDays);
		System.out.println("-----Removing saturSay to working day-------");
		workingDays.remove(Day.SATURDAY);
		System.out.println("workingDays :"+workingDays);
		System.out.println("-----Checking contains() to working day-------");
		System.out.println("workingDays "+Day.MONDAY+" is present :"+workingDays.contains(Day.MONDAY));
		System.out.println("Creationg iterater");
		Iterator<Day> i=workingDays.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("WorkingDays count :"+workingDays.size());
		System.out.println("it is empty are :"+workingDays.isEmpty());
		System.out.println("Creating clonig ");
		EnumSet<Day> copyOfWorkingDays=workingDays.clone();
		Iterator<Day> i1=copyOfWorkingDays.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("Useing complimentOf()");
		EnumSet<Day> newDays=EnumSet.complementOf(workingDays);
		System.out.println("newDays "+newDays);
		System.out.println("Clearing weekEnd ");
		weekEnd.clear();
		System.out.println("Weekend size :"+weekEnd);
		EnumSet<Day> allDays=EnumSet.allOf(Day.class);
		System.out.println("AllDays in enum :"+allDays);

		EnumSet<Day> emptyDayse=EnumSet.noneOf(Day.class);
		System.out.println("Empty enum :"+emptyDayse);
	}

}
