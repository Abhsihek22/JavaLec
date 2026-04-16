package practice;

import java.util.HashSet;

public class practiceHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<String>();
		set.add("Abhishek");
		set.add("Welcome");
		set.add("Way2Automation");
		set.add("Selenium");
		set.add("Appium");
		set.add("Welcome"); //duplicate value not allowed in HashSet
		
		System.out.println(set);
		System.out.println("Size of an set is: "+set.size());
		
		set.remove("Selenium");
		System.out.println(set);
		System.out.println("Size of an set is: "+set.size());

	}

}
